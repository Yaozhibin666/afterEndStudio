package com.example.yx_login3.mapper;

import com.example.yx_login3.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectUsernmaeAndPassword(@Param("username") String username, @Param("password") String password);
}