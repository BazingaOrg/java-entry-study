package com.itheima.test;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        String finalStr = str.replace("TMD", "***");
        System.out.println(finalStr);
    }
}
