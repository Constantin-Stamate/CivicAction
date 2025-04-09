package org.example.civic.service;

import org.example.civic.dto.UserDto;
import org.example.civic.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
}