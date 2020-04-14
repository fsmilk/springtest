package com.sp02.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean 的后置处理器  对 IOC 容器所有bean 起作用
 */
public class MyBeanPostProcessor implements BeanPostProcessor{
    /**
     * bean生命周期初始化之后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        //记得返回bean对象
        return bean;
    }

    /**
     * bean生命周期初始化之前执行
     * @param bean ： 正在创建的bean对象
     * @param beanName bean对象的id
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        //记得返回bean对象
        return bean;
    }
}
