package com.example.yx_login3.service.serviceImp;


import com.example.yx_login3.mapper.UserMapper;
import com.example.yx_login3.entity.User;
import com.example.yx_login3.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class LoginServicelmp implements LoginService {

    @Resource
    UserMapper userMapper;

    public  User check(String username,String password) throws IOException {
        User user = userMapper.selectUsernmaeAndPassword(username,password);
        return user;
    }


}

