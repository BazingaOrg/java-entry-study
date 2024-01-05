package com.itheima.constructor;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是 Student 类的构造方法（构造器）");
    }
}
