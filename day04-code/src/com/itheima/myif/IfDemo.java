package com.itheima.myif;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        ifTest1();
    }

    public static void ifTest1() {
        System.out.println("开始");

//        int age = 17;
//        if(age >= 18) {
//            System.out.println("可以上网吧！");
//        } else {
//            System.out.println("您的年龄未满18岁，不可以上网吧！");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int num = sc.nextInt();

        if(num == 1) {
            System.out.println("会员身份");
        } else if(num == 2) {
            System.out.println("非会员身份");
        } else {
            System.out.println("输入有误");
        }

        System.out.println("结束");
    }
}
