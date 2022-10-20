package com.example.yx_login3.service.serviceImp;

import com.example.yx_login3.entity.User;
import com.example.yx_login3.mapper.UserMapper;
import com.example.yx_login3.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public boolean add(User user) {return userMapper.add(user);}

    @Override
    public boolean delete(int id) {return userMapper.delete(id);}

    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public User queryOne(int id) {
        return userMapper.queryOne(id);
    }
}
