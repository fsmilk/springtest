package com.sp02.test;


import com.sp02.lifecycle.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    @Test
    public void testScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring02-scope.xml");

        Car c1 = ac.getBean("car", Car.class);
        Car c2 = ac.getBean("car", Car.class);

        if(c1 == c2) System.out.println(true);
    }

    @Test
    public void testLifeCycle(){
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        Car car = ac.getBean("car",Car.class);
        System.out.println("===>4. 使用bean对象：" + car);

        //关闭容器
        ac.close();

    }
}

