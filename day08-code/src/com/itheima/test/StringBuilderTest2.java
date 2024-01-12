package com.itheima.test;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        arrayToString(arr);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]).append(" ]");
        System.out.println(sb);
        return sb.toString();
    }
}
