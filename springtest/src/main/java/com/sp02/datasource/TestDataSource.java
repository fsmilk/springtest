package com.sp02.datasource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestDataSource {


    @Test
    public void test() throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-datasource.xml");

        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
