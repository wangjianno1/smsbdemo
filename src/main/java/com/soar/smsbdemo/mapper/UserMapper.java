package com.soar.smsbdemo.mapper;

import com.soar.smsbdemo.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userId",  column = "id"),
            @Result(property = "name", column = "name")
    })
    List<User> getAllUsers();
}
