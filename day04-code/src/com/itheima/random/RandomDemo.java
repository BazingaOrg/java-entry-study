package com.itheima.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        randomTest();
    }

    public static void randomTest() {
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.println(r.nextInt(10));
        }
    }
}
