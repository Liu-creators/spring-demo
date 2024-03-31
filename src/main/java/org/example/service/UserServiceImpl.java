package org.example.service;

import org.example.mapper.UserMapper;
import org.example.spring.annotation.Autowired;
import org.example.spring.annotation.Component;
import org.example.spring.annotation.Lazy;

/**
 * -03/29-1:58
 * -组件类
 */
@Lazy
@Component
public class UserServiceImpl implements UserService{
    @Autowired(required = false)
    private UserMapper userMapper;

    public UserServiceImpl() {

    }
    public void test() {
        System.out.println("UserServiceImpl 方法" + userMapper.toString());
    }
}
