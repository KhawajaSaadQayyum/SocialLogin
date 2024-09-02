package com.saad.oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
public class OauthController {
    @RequestMapping
    public ResponseEntity<String> login(){
        return ResponseEntity.ok("Hello Welcome");
    }
}
