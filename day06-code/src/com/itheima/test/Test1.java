package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        knockSeven();
        System.out.println("------------");
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = arrayElementSummation(arr);
        System.out.println("求和结果是：" + sum);
    }

    public static void knockSeven() {
        for (int i = 1; i <= 100; i++) {
            if((i % 7 == 0) || (i % 10 == 7) || (i / 10 == 7)) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int arrayElementSummation(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) && (arr[i] % 10 != 7) && (arr[i] / 10 != 7)) {
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        return sum;
    }
}