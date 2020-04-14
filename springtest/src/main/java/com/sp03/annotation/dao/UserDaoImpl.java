package com.sp03.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public void addUser() {
        System.out.println("UserDao...");
    }
}
