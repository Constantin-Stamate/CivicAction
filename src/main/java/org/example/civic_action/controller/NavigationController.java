package org.example.civic_action.controller;

import org.example.civic_action.entity.Law;
import org.example.civic_action.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NavigationController {

    @Autowired
    private LawService lawService;

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
        List<Law> lawsAll = lawService.getAllLaws();
        for (Law law : lawsAll) {
            String userImage = law.getUserGender().equals("Male") ? "/images/users/user_1.png" : "/images/users/user_2.png";
            law.setUserImage(userImage);
        }
        model.addAttribute("lawsAll", lawsAll);
        return "results";
    }
}