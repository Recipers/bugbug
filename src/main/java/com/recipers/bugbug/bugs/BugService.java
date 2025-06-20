package com.recipers.bugbug.bugs;

import com.recipers.bugbug.bugs.domain.Bug;
import com.recipers.bugbug.bugs.dto.response.BugListResponseDto;
import com.recipers.bugbug.bugs.repository.BugRepository;
import com.recipers.bugbug.bugs.repository.BugStepRepository;
import com.recipers.bugbug.common.exception.NotFoundException;
import java.time.format.DateTimeFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BugService {

    private final BugRepository bugRepository;
    private final BugStepRepository bugStepRepository;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Bug findBugById(Long id) {

        return bugRepository.findById(id).orElseThrow(()-> new NotFoundException(""));
    }

    /**
     * 모든 버그(문제) 목록을 페이징으로 조회
     */
    public Page<BugListResponseDto> getAllBugsWithPaging(Pageable pageable) {
        Page<Bug> bugPage = bugRepository.findAllByOrderByIdAsc(pageable);
        return bugPage.map(bug -> BugListResponseDto.from(bug, false));
    }

    /**
     * 검색어로 버그 목록 필터링 (페이징)
     */
    public Page<BugListResponseDto> searchBugsWithPaging(String keyword, Pageable pageable) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getAllBugsWithPaging(pageable);
        }

        // 제목 또는 설명에서 검색 (대소문자 무시, ID 순 정렬, 페이징)
        Page<Bug> bugPage = bugRepository
            .findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrderByIdAsc(
                keyword.trim(), keyword.trim(), pageable);

        return bugPage.map(bug -> BugListResponseDto.from(bug, false));
    }
}
