package org.example.civic.controller;

import org.example.civic.dto.LawDto;
import org.example.civic.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LawController {

    @Autowired
    private LawService lawService;

    @Autowired
    private NavigationController navigationController;

    @PostMapping("/law/submit")
    public String saveLaw(@RequestParam("userName") String userName,
                          @RequestParam("userGender") String userGender,
                          @RequestParam("lawDescription") String lawDescription,
                          @RequestParam("lawCategory") String lawCategory, Model model) {
        LawDto lawDto = new LawDto();
        lawDto.setUserName(userName);
        lawDto.setUserGender(userGender);
        lawDto.setLawDescription(lawDescription);
        lawDto.setLawCategory(lawCategory);

        lawService.saveLaw(lawDto);
        return navigationController.index(model);
    }
}
