package com.sp.relation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {


    @Test
    public void testRelation(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-relation.xml");

        Address a2 =ac.getBean("addr2",Address.class);

        System.out.println(a2.toString());
    }
    @Test
    public void testDepend(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-relation.xml");

        Address a3 =ac.getBean("addr3",Address.class);

        System.out.println(a3.toString());
    }
}
