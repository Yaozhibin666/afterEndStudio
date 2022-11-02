package com.example.yx_login3.controller;

import com.example.yx_login3.Utils.ResultUtil;
import com.example.yx_login3.common.Result;
import com.example.yx_login3.common.ResultEnum;
import com.example.yx_login3.entity.User;
import com.example.yx_login3.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    /*增添用户信息*/
    @PostMapping("/userAdd")
    public Result userAdd(User user){
        if(userService.add(user))
            return ResultUtil.success(userService.add(user));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /*删除用户信息*/
    @DeleteMapping("/userDel/{id}")
    public Result userDel(@PathVariable int id){
        if(userService.delete(id))
            return ResultUtil.success(userService.delete(id));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /*修改用户信息*/
    @PostMapping("/userEdit")
    public Result userEdit(User user){
        if(userService.update(user))
            return ResultUtil.success(userService.update(user));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /*查询所有用户信息*/
    @GetMapping("/userQueryAll")
    public Result userQueryAll(){
        return ResultUtil.success(userService.queryAll());
    }

    /*查询指定用户信息*/
    @GetMapping("/userQueryOne/{id}")
    public Result userQueryOne(@PathVariable int id){return ResultUtil.success(userService.queryOne(id));}


}
