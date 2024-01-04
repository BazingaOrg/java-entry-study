package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {34, 25, 12, 99, 87, 63, 58, 31, 18, 14};
        arrayExchange1(arr);
        System.out.println("--------");
        arrayExchange2(arr);
    }

    public static void arrayExchange1(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void arrayExchange2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
