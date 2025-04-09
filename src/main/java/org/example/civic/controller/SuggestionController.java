package org.example.civic.controller;

import org.example.civic.dto.SuggestionDto;
import org.example.civic.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuggestionController {

    @Autowired
    private SuggestionService suggestionService;

    @Autowired
    private NavigationController navigationController;

    @PostMapping("/suggestion/save")
    public String saveSuggestion(@RequestParam("userName") String userName,
                                 @RequestParam("email") String email,
                                 @RequestParam("priorityArea") String priorityArea,
                                 @RequestParam("improvement") String improvement, Model model) {
        SuggestionDto suggestionDto = new SuggestionDto();
        suggestionDto.setUserName(userName);
        suggestionDto.setEmail(email);
        suggestionDto.setPriorityArea(priorityArea);
        suggestionDto.setImprovement(improvement);

        suggestionService.saveSuggestion(suggestionDto);
        return navigationController.laws(model);
    }
}
