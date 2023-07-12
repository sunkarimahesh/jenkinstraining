package com.aws.training.demo.aws.com.aws.training.demo.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

    @GetMapping("/")
    public String getMessage(){

        return "Hello AWS Training Success!!!";
    }
}
