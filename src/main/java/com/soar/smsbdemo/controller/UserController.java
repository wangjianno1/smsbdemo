package com.soar.smsbdemo.controller;

import com.soar.smsbdemo.entity.User;
import com.soar.smsbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService helloService;

    @GetMapping("/user")
    public List<User> getAllUser() {
        List<User> stus = helloService.getAllUser();
        return stus;
    }

    @GetMapping("/user2")
    public List<User> getAllUser2() {
        List<User> users = helloService.getAllUser2();
        return users;
    }
}
