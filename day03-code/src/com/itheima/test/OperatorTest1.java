package com.itheima.test;

import java.util.Scanner;

public class OperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        System.out.println("请输入第三个整数：");
        int num3 = sc.nextInt();

        System.out.println("输入的三个整数中，最大整数为：" + (num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3) );
    }
}
