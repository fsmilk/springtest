package com.sp03.annotation.service;

import com.sp03.annotation.dao.UserDao;
import com.sp03.annotation.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /**
     * @Autowired完成bean属性的自动装配
     *
     * 工作机制: 首先会使用byType 的方式进行自动装配，如果能唯一匹配，则装配成功
     *          如果匹配到多个兼容类型的bean，还会尝试使用byName的方式进行唯一确定
     *          如果能唯一确定，则装配成功，如果不能唯一确定，则装配失败，抛出异常。
     *
     *  默认情况下,使用@autowired标注属性必须被装配，否则抛出异常
     *  可以@Autowired(required=false)设置不一定被装配
     *
     *  如果匹配到多个兼容的bean，可以使用@Qualifier来进一步指定要装配的bean的id值
     *
     * @Autowired @Qualifier 注解即可在成员变量上，也可以加在对应的set()上.(开发直接放在成员变量上)
     *     @Autowired(required = false)
     *     @Qualifier("userDaoMybatisImpl")
     *     private UserDao userDao;
     *
     */


    @Autowired(required = false)
    @Qualifier("userDaoMybatisImpl")
    private UserDao userDao;

    public void handleUser() {
        userDao.addUser();
    }
}
