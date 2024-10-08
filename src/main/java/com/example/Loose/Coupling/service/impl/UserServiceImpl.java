package com.example.Loose.Coupling.service.impl;

import com.example.Loose.Coupling.mapper.UserMapper;
import com.example.Loose.Coupling.model.User;
import com.example.Loose.Coupling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
}