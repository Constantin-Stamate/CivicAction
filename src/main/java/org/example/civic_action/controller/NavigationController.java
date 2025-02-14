package org.example.civic_action.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("page", "home");
        return "index";
    }

    @GetMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("page", "chat");
        return "chat";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("page", "contact");
        return "contact";
    }

    @GetMapping("/laws")
    public String laws(Model model) {
        model.addAttribute("page", "laws");
        return "laws";
    }

    @GetMapping("/results")
    public String results(Model model) {
        model.addAttribute("page", "results");
        return "results";
    }
}