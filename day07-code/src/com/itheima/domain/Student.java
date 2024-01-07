package com.itheima.domain;

public class Student {
    // 1. 成员变量私有化
    private String name;
    private int age;

    // 2. 无参、有参构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 对于私有的成员变量、提供对应的setXxx()、getXxx()方法
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
