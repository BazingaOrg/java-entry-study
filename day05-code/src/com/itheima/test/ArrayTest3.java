package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
//        arrayTest1();
        System.out.println("-----------");
        arrayTest2();
    }

    public static void arrayTest1() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("请录入第" + (i + 1) + "个同学的成绩");
            arr[i] = sc.nextInt();
        }
        int max = getMax(arr);
        System.out.println("最大值是：" + max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void arrayTest2() {
        Random r = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
        int min = getMin(arr);
        System.out.println("最小值是：" + min);
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
