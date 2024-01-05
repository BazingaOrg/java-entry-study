package com.itheima.oop;

public class Book {
    // 属性：编号、书名、价格
    int id;
    String name;
    double price;

    // 行为：展示
    public void show() {
        System.out.println("编号：" + id + " 书名：" + name + " 价格：" + price);
    }
}
