package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.UserDTO;
import org.apache.catalina.User;

public interface UserService {

    UserDTO register(UserDTO userDTO);
    UserDTO login(String email, String password);
}
