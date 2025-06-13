package com.recipers.bugbug.bugs;

import com.recipers.bugbug.bugs.domain.Bug;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
