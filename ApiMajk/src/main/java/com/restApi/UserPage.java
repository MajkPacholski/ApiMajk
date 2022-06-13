package com.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api/v1")

public class UserPage {
    @GetMapping
    public User getUser(){
        return new User(1L,"Michal", 33, "IT noob");
    }
}
