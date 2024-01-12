package com.itheima.test;

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())) {
            System.out.println("是回文字符串");
        } else {
            System.out.println("不是回文字符串");
        }
    }
}
