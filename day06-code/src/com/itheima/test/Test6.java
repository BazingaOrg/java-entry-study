package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        judgesScore();
    }

    public  static void judgesScore() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] scores = new int[6];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = r.nextInt(101);
            System.out.println(scores[i]);
        }

        int max = scores[0];
        int min = scores[0];
        int sum = scores[0];

        for (int i = 1; i < scores.length; i++) {
            max = Math.max(max, scores[i]);
            min = Math.min(min, scores[i]);
            sum += scores[i];
        }

        double avg = (sum - max -min) * 1.0 / (scores.length - 2);

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + avg);
    }
}
