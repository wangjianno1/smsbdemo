package com.soar.smsbdemo.service.impl;

import com.soar.smsbdemo.entity.User;
import com.soar.smsbdemo.mapper.UserMapper;
import com.soar.smsbdemo.repository.UserRepository;
import com.soar.smsbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUser2() {
        return userMapper.getAllUsers();
    }

    @Override
    public void addUser() {
        User u = new User();
        u.setName("ZhouBa");
        userRepository.save(u);
    }
}
