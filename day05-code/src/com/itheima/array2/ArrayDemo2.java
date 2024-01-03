package com.itheima.array2;

public class ArrayDemo2 {
    public static void main(String[] args) {
        arrayTest1();
    }

    private static void arrayTest1() {
        int[][] arr = new int[2][3];

        arr[0][0] = 11;
        arr[1][0] = 44;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
