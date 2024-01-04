package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 26, 50};
        int index = findIndex(arr);
        System.out.println(index);
    }

    public static int findIndex(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个你想要查找的数字：");
        int findNum = sc.nextInt();
        int findIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNum) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }
}
