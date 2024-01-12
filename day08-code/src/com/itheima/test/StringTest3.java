package com.itheima.test;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号：");
        String phone = sc.nextLine();
        String firstNumber = phone.substring(0, 3);
        String lastNumber = phone.substring(7);
        String finalPhone = firstNumber + "****" + lastNumber;
        System.out.println(finalPhone);
    }
}
