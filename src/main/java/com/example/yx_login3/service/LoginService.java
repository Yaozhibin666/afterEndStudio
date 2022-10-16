package com.example.yx_login3.service;

import com.example.yx_login3.entity.User;

import java.io.IOException;

public interface LoginService {
    public User check(String username,String password) throws IOException;
}
