package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 26, 50, 19, 19};
        int[] result = findIndex(arr);
        System.out.println(result);
    }

    public static int[] findIndex(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个你想要查找的数字：");
        int findNum = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNum) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNum) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }
}
