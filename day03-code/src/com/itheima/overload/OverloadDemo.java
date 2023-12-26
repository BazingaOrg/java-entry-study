package com.itheima.overload;

public class OverloadDemo {
    /*
        方法重载（overload）：方法与方法之间的一种关系
        识别：在同一个类中，方法名相同，参数不同（参数个数、参数类型、顺序不同），与返回值无关
    */
    public static void main(String[] args) {
        System.out.println();
    }

    public static void add(int num1, int num2) {
    }

    public static void add(double num1, int num2) {
    }
}
