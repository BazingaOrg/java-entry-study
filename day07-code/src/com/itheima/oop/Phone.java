package com.itheima.oop;

public class Phone {
    // 属性：品牌、颜色、价格
    String brand;
    String color;
    int price;

    // 行为：打电话、发短信
    public void call(String name) {
        System.out.println("给"  + name + "打电话中...");
    }

    public void sendSms() {
        System.out.println("发短信中...");
    }
}
