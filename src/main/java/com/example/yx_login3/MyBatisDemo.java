package com.example.yx_login3;


import com.example.yx_login3.mapper.UserMapper;
import com.example.yx_login3.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class MyBatisDemo {

    @Resource
    UserMapper userMapper;
    public  User check(String username,String password) throws IOException {


        User user = userMapper.selectUsernmaeAndPassword(username,password);

//
        return user;
    }
}

