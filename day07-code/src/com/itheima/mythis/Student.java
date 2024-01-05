package com.itheima.mythis;

public class Student {
    String name;
     public void sayHello(String name) {
         System.out.println(name);
         System.out.println(this.name);
     }

     public void print() {
         System.out.println("print方法中打印 this 关键字 ==》 " + this);
     }
}
