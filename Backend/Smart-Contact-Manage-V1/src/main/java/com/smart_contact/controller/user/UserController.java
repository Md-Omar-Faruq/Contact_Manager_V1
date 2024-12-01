package com.smart_contact.controller.user;

import com.smart_contact.constant.ApiEndPoint;
import com.smart_contact.model.User;
import com.smart_contact.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiEndPoint.API_V1_USER_ENDPOINT)
@RequiredArgsConstructor
public class UserController {

    private final UserRepo userRepo;

    @PostMapping
    public ResponseEntity<User> createUser(){
        User user = new User();
        user.setName("Md. Omar Faruq");
        user.setEmail("fmd92330@gmail.com");

        userRepo.save(user);

        return ResponseEntity.ok().body(user);

    }

    @GetMapping
    public ResponseEntity<String> greetings(){
        return ResponseEntity.ok("Welcome");
    }

}
