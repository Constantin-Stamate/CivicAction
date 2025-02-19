package org.example.civic_action.controller;

import org.example.civic_action.dto.ContactDto;
import org.example.civic_action.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private NavigationController navigationController;

    @PostMapping("/contact/save")
    public String saveContact(@RequestParam("userName") String userName,
                              @RequestParam("email") String email,
                              @RequestParam("subject") String subject,
                              @RequestParam("message") String message, Model model) {
        ContactDto contactDto = new ContactDto();
        contactDto.setUserName(userName);
        contactDto.setEmail(email);
        contactDto.setSubject(subject);
        contactDto.setMessage(message);

        contactService.saveContact(contactDto);
        return navigationController.contact(model);
    }
}

