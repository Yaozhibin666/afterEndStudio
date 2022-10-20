package com.example.yx_login3.controller;

import com.example.yx_login3.entity.User;
import com.example.yx_login3.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    /*增添用户信息*/
    @PostMapping("/userAdd")
    public Boolean userAdd(User user){return userService.add(user);}

    /*删除用户信息*/
    @DeleteMapping("/userDel/{id}")
    public Boolean userDel(@PathVariable int id){return userService.delete(id);}

    /*修改用户信息*/
    @PostMapping("/userEdit")
    public Boolean userEdit(User user){return userService.update(user);}

    /*查询所有用户信息*/
    @GetMapping("/userQueryAll")
    public List<User> userQueryAll(){return userService.queryAll();}

    /*查询指定用户信息*/
    @GetMapping("/userQueryOne/{id}")
    public User userQueryOne(@PathVariable int id){return userService.queryOne(id);}


}
