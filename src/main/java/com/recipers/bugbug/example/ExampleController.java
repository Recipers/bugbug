package com.recipers.bugbug.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    @GetMapping(value = "")
    public String examplePage(Model model) {

        return "example/example";
    }
}
