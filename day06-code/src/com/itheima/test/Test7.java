package com.itheima.test;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        String code = generateVerificationCode();
        System.out.println(code);
    }

    public static String generateVerificationCode() {
        char[] chars = generateChars();
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            code += chars[r.nextInt(chars.length)];
        }
        return code;
    }

    public static char[] generateChars() {
        char[] chars = new char[26 + 26 + 10];
        int index = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            chars[index] = c;
            index++;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            chars[index] = c;
            index++;
        }

        for (char c = '0'; c <= '9'; c++) {
            chars[index] = c;
            index++;
        }

        System.out.println(chars);
        return chars;
    }
}
