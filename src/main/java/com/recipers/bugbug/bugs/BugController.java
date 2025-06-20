package com.recipers.bugbug.bugs;

import com.recipers.bugbug.bugs.domain.Bug;
import com.recipers.bugbug.bugs.dto.response.BugListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/bugs")
@RequiredArgsConstructor
public class BugController {

    private final BugService bugService;

    @GetMapping(value = "/{id}")
    public String bugPage(@PathVariable Long id, Model model) {

        Bug bug = bugService.findBugById(id);
        model.addAttribute("bug", bug);
        return "bugs/bug";
    }

    @GetMapping
    public String bugListPage(
        @RequestParam(defaultValue = "") String search,
        @PageableDefault(
            size = 3,                           // 페이지당 3개
            sort = "id",                        // id로 정렬
            direction = Sort.Direction.ASC      // 오름차순
        ) Pageable pageable,
        Model model) {

        // 검색어가 있으면 필터링된 목록, 없으면 전체 목록 (페이징 적용)
        Page<BugListResponseDto> bugPage = bugService.searchBugsWithPaging(search, pageable);

        // 페이지가 범위를 벗어나면 마지막 페이지로 리다이렉트
        if (pageable.getPageNumber() > 0 && pageable.getPageNumber() >= bugPage.getTotalPages()) {
            return "redirect:/bugs?search=" + search + "&page=" + Math.max(0, bugPage.getTotalPages() - 1);
        }

        // 모델에 데이터 추가
        model.addAttribute("bugPage", bugPage);
        model.addAttribute("bugList", bugPage.getContent());
        model.addAttribute("searchKeyword", search);
        model.addAttribute("currentPage", pageable.getPageNumber());
        model.addAttribute("totalPages", bugPage.getTotalPages());
        model.addAttribute("totalElements", bugPage.getTotalElements());
        model.addAttribute("hasNext", bugPage.hasNext());
        model.addAttribute("hasPrevious", bugPage.hasPrevious());

        return "bugs/bugList";
    }
}
