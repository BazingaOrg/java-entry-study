package com.itheima.oop;

public class StudentTest {
    /*
         创建 Student 类的对象进行使用
         1. 创建对象的格式：
            类名 对象名 = new 类名();
         2. 使用对象成员变量的格式：
            对象名.成员变量;
         3. 使用对象成员方法的格式：
            对象名.成员方法();

         细节：
            1. 打印对象名，可以看到对象的内存地址；
                com.itheima.oop.Student@30f39991
                全类名：包名 + 类名
            2. 成员变量就算没有赋值，也可以直接用，使用的是对象的默认值；
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name); // com.itheima.oop.Student@30f39991
        stu1.study();
    }
}
