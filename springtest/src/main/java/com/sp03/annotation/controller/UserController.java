package com.sp03.annotation.controller;

import com.sp03.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Controller
 * 相当于在xml文件中设置bean，默认id是类名首字母小写
 * 可以手动设置ID,value=xxx 可以缺少value=直接写id
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void regist(){
        userService.handleUser();
    }

}
