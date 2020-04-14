package com.sp.factory;

import com.sp.vo.Car;
import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

    /**
     * 工厂bean具体创建的bean对象由getObject来返回
     * spring 支持参与到bean对象建设过程
     * @return
     * @throws Exception
     */
    public Car getObject() throws Exception {
        return new Car("Audi","yiqi",100000.00);
    }

    /**
     * 返回具体bean对象类型
     * @return
     */
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * bean可以是单例可以是非单例  bean作用域再研究
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
