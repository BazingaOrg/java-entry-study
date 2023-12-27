package com.itheima.test;

public class WhileTest {
    public static void main(String[] args) {
        daffodilNumber();
    }

    public static void daffodilNumber() {
        int i = 100;
        while (i <= 999) {
            int individualNum = i % 10;
            int tenNum = (i % 100) / 10;
            int hundredNum = i / 100;
            if ((Math.pow(individualNum, 3) + Math.pow(tenNum, 3) + Math.pow(hundredNum, 3)) == i) {
                System.out.println(i);
            }
            i++;
        }
    }
}
