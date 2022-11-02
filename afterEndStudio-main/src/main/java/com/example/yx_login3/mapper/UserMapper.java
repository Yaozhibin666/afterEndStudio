package com.example.yx_login3.mapper;

import com.example.yx_login3.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /*查询用户是否存在*/
    User selectUsernmaeAndPassword(@Param("username") String username, @Param("password") String password);

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