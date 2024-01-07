package com.itheima.encapsulation;

public class Student {
    /*
          1. 私有变量成员（为了数据的安全性）
          2. 针对私有变量成员提供setXxx()、getXxx()方法
     */
    private int age;

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("设置的年龄有误，应该在 0 到 100 之间");
        }
    }

    public int getAge() {
        return this.age;
    }
}
