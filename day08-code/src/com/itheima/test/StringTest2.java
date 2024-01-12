package com.itheima.test;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        countCharNum();
    }

    private static void countCharNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        int lowerNum = 0;
        int upperNum = 0;
        int digitNum = 0;
        int otherNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                upperNum++;
            } else if(Character.isLowerCase(str.charAt(i))) {
                lowerNum++;
            } else if(Character.isDigit(str.charAt(i))) {
                digitNum++;
            } else {
                otherNum++;
            }
        }
        System.out.println("大写字母次数是：" + upperNum + "小写字母次数是：" + lowerNum + "数字次数是：" + digitNum + "其他字符次数是：" + otherNum);
    }
}
