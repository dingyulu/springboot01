package com.yjxxt.springboot.service;

import com.yjxxt.springboot.mapper.RoleMapper;
import com.yjxxt.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    public void test01(){
        System.out.println("UserService test01.....");
        userMapper.test01();
        roleMapper.test01();
    }


}
