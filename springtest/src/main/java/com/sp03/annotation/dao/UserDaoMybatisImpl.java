package com.sp03.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoMybatisImpl implements UserDao{

    public void addUser() {
        System.out.println("UserDaoMybatisImpl......");
    }
}
