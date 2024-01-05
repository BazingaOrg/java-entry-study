package com.itheima.mythis;

public class ThisDemo {
    /*
        情况：成员变量和局部变量重名的时候，Java 使用的就近原则；
        如果非要使用成员变量，则可以使用 this 关键字解决；
        --------------------------------------------------------
        this 关键字的作用：
            this 可以调用本类的成员（变量、方法）
        --------------------------------------------------------
        this 介绍：
            代表当前类对象的引用（地址）；
            谁来调用我，我就代表谁；
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.sayHello("李四");
        System.out.println(stu1);
        stu1.print();
    }
}
