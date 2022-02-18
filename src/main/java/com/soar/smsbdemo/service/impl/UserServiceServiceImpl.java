package com.soar.smsbdemo.service.impl;

import com.soar.smsbdemo.entity.User;
import com.soar.smsbdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceServiceImpl implements UserService {
    @Override
    public List<User> getAllStudent() {

        User stu1 = new User();
        stu1.setUserId(1);
        stu1.setName("ZhangSan");

        User stu2 = new User();
        stu2.setUserId(2);
        stu2.setName("LiSi");

        List<User> stus = new ArrayList<User>();
        stus.add(stu1);
        stus.add(stu2);

        return stus;
    }
}
