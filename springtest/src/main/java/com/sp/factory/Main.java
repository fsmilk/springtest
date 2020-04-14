package com.sp.factory;

import com.sp.vo.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac  = new ClassPathXmlApplicationContext("spring-factory.xml");

        Car car = ac.getBean("carFactory",Car.class);
        System.out.println(car.toString());
    }
}
