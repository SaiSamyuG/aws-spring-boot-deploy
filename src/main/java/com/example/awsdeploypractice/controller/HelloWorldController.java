package com.example.awsdeploypractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/welcome")
    public ResponseEntity<?> welcome(){
        return ResponseEntity.ok("welcome the magic");
    }
}
