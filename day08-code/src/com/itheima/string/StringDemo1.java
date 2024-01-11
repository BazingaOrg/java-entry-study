package com.itheima.string;

import com.itheima.domain.Student;

public class StringDemo1 {
    /*
         String类的特点：
             1. Java中所有双引号字符串，都是String这个类的对象；
             2. 字符串一旦被创建，就不可更改；
             3. String虽然不可改变，但是可以被共享；
                字符串常量池（jdk7版本之前放在方法区，jdk7版本以上放在堆内存）：当我们使用双引号创建字符串对象时，会检查常量池中是否存在该数据，不存在则创建，存在则复用；
     */
    public static void main(String[] args) {
        String s = "abc";
        s = "def";
        System.out.println(s.toUpperCase());

        Student stu = new Student("张三", 20);
        stu = new Student("李四", 30);
        System.out.println(stu.getName() + "----"  + stu.getAge());
    }
}
