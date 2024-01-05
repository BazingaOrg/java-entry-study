package com.itheima.constructor;

public class StudentTest {
    /*
          构造方法（构造器）：
            作用：创建对象的时候，自动执行的方法，可以做一些初始化的操作
            格式：
                1. 方法名和类名大小写一致；
                2. 没有返回值类型，void 都没有；
                3. 没有具体的返回值（不能由 return 语句带回结果数据）；
            执行时机：
                在创建对象的时候，被调用执行；
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        System.out.println(stu1.name + "------" + stu1.age);
    }
}
