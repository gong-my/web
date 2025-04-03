package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.dto.UserDTO;
import com.ecommerce.project.mappers.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserDTO selectUserId(UserDTO user) {
        return userMapper.selectUserId(user);
    }

}
