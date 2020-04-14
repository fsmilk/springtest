package com.sp02.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

    @Test
    public void testAutowire(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowire.xml");

        Person person = ac.getBean("person", Person.class);
        System.out.println(person);

    }


}
