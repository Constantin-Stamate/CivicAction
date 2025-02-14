package org.example.civic_action.service;

import org.example.civic_action.dto.UserDto;
import org.example.civic_action.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
}