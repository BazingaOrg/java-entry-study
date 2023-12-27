package com.itheima.control;

import java.util.Scanner;

public class BreakDemo {
    // break：只能在循环中或者switch中使用
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            System.out.println("请输入密码：");
            int inputPwd = sc.nextInt();
            if(inputPwd == 123456) {
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误");
            }
        }
    }
}
