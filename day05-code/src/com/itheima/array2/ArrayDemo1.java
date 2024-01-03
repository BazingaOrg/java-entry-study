package com.itheima.array2;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 二维数组存储的是一维数组的地址
        int[][] arr = {{11, 22}, {33, 44}};
        System.out.println(arr); // [[I@a09ee92
        System.out.println(arr[0]); // [I@30f39991
        System.out.println(arr[1]); // [I@452b3a41
        System.out.println(arr[1][0]);
    }
}
