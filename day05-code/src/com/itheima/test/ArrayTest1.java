package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        getEvenSum();
    }

    public static void arrayTest1() {
        int[] arr = {1, 22, 333, 4444, 55555};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void getEvenSum() {
        int sum = 0;
        int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("偶数和为：" + sum);
    }
}
