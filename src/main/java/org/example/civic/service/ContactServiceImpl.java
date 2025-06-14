package org.example.civic.service;

import org.example.civic.dto.ContactDto;
import org.example.civic.entity.Contact;
import org.example.civic.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void saveContact(ContactDto contactDto) {
        Contact contact = new Contact();

        contact.setUserName(contactDto.getUserName());
        contact.setEmail(contactDto.getEmail());
        contact.setSubject(contactDto.getSubject());
        contact.setMessage(contactDto.getMessage());

        contactRepository.save(contact);
    }
}
