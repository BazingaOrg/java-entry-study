package com.itheima.operate;

public class OperateDemo {
    /*
        算术运算符：
            · +
            · -
            · *
            · / ：整数相除，结果只能得到整数，要想得到小数，需要有小数参与运算。
            · % ：取模，作用是用来取余数、判断奇偶数。
    */
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2);
        System.out.println(5.0 / 2.0);

        System.out.println(5 % 2);
        System.out.println(0 % 2);
    }
}
