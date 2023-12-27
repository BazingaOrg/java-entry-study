package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        guessNum();
    }

    public static void guessNum() {
        Random r = new Random();
        int rNum = r.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要猜的数字：");
            int gNum = sc.nextInt();

            if (gNum < rNum) {
                System.out.println("猜小了");
            } else if (gNum > rNum) {
                System.out.println("猜大了");
            } else if (gNum == rNum) {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
