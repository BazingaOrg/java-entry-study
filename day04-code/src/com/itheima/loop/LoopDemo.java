package com.itheima.loop;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        checkPassword();
    }

    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {
            System.out.println("请输入密码：");
            int inputNum  = sc.nextInt();
            if(inputNum == 123456) {
                System.out.println("密码正确");
            } else {
                System.out.println("密码错误");
            }
        }
    }
}
