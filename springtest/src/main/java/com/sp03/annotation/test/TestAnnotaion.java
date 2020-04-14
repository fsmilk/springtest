package com.sp03.annotation.test;

import com.sp03.annotation.controller.UserController;
import com.sp03.annotation.dao.UserDaoImpl;
import com.sp03.annotation.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotaion {

    @Test
    public void testA(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController uc = ac.getBean("userController", UserController.class);
        uc.regist();
        /**
        UserServiceImpl us = ac.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(us);

        UserDaoImpl ud = ac.getBean("userDaoImpl", UserDaoImpl.class);
        System.out.println(ud);
         **/

    }
}
