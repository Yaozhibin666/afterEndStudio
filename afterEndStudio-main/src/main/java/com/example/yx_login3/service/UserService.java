package com.example.yx_login3.service;

import com.example.yx_login3.entity.User;

import java.util.List;

public interface UserService {
    /*增添用户*/
    boolean add(User user);

    /*删除用户*/
    boolean delete(int id);

    /*修改用户*/
    boolean update(User user);

    /*查询所有用户*/
    List<User> queryAll();

    /*查询单个用户*/
    User queryOne(int id);

}
