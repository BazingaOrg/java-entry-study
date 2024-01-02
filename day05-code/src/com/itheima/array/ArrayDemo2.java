package com.itheima.array;

public class ArrayDemo2 {
    public static void main(String[] args) {

    }

    public static void arrayTest() {
        int[] arr = {11, 22, 33};
        System.out.println(arr[0]);

        if (arr[1] % 2 == 0) {
            System.out.println(arr[1] + "是一个偶数");
        } else {
            System.out.println(arr[1] + "是一个奇数");
        }

        arr[2] = 66;
        System.out.println(arr[2]);
    }
}
