package com.smart_contact.service;

import com.smart_contact.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    // Create User
    User createUser(User user);

    User updateUser(Long id, User user);

}
