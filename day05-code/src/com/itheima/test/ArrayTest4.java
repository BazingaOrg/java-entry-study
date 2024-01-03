package com.itheima.test;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33},{44, 55, 66}};
        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("二维数组的和为：" + sum);
    }
}
