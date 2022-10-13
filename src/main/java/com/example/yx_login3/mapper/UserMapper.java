package com.example.yx_login3.mapper;

import com.example.yx_login3.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectUsernmaeAndPassword(@Param("username") String username, @Param("password") String password);
    public List<User> queryUser2(String username, String age);

}
