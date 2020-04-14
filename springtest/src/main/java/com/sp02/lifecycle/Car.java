package com.sp02.lifecycle;

public class Car {
    private String brand;
    private Double price;

    public Car() {
        System.out.println("==>1.调用构造器创建bean对象");
    }

    /**
     * 初始化方法
     * 需要配置bean设置init-method指定初始化方法
     * @return
     */
    public void init(){
        System.out.println("==>3.调用初始化方法");
    }

    /**
     * 销毁方法：IOC容器关闭，bean对象销毁
     */
    public void destory(){
        System.out.println("==>3.调用销毁方法");
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("==>2.给对象属性赋值")
        ;this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
