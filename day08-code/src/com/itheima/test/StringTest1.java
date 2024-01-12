package com.itheima.test;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        String userName = "admin";
        String passWord = "Admin123456";
        simulatedLogin(userName, passWord);
    }

    public static void simulatedLogin(String userName, String passWord) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        do {
            inputNum++;
            System.out.println("请输入用户名：");
            String inputUserName = sc.nextLine();
            System.out.println("请输入密码：");
            String inputPassWord = sc.nextLine();

            if (!userName.equalsIgnoreCase(inputUserName)) {
                System.out.println("用户名不正确");
            } else if (!passWord.equalsIgnoreCase(inputPassWord)) {
                System.out.println("密码不正确");
            } else {
                System.out.println("登录成功！");
            }
        } while (inputNum < 3);
    }
}
