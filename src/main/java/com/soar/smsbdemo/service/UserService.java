package com.soar.smsbdemo.service;

import com.soar.smsbdemo.entity.User;
import java.util.List;

public interface UserService {

    /**
     * 使用Spring Data JPA访问数据库，底层使用的是Hibernate
     * @return
     */
    public List<User> getAllUser();

    /**
     * 使用MyBatis访问数据库，底层使用的就是Mybatis
     * @return
     */
    public List<User> getAllUser2();

    public void addUser();
}
