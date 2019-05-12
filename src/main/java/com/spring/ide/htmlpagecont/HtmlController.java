package com.spring.ide.htmlpagecont;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/registration")
    public String registration(Model model) {
        return "registration";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }

}
