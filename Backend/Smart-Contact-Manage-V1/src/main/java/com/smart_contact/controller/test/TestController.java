package com.smart_contact.controller.test;

import com.smart_contact.constant.ApiEndPoint;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiEndPoint.API_V1_TEST_ENDPOINT)
public class TestController {

    @GetMapping
    public ResponseEntity<String> greetings(){
        return ResponseEntity.ok("Welcome To Smart Contact Managere:");
    }

}
