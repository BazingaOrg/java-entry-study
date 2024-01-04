package com.itheima.test;

public class Test2 {
    /*
        ==:
            1. 基本数据类型：比较值
            2. 引用数据类型：比较地址
    */
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = {11, 22, 33};
        Boolean isSameArray = checkArrayContent(arr1, arr2);
        System.out.println("是否相同：" + isSameArray);
    }

    public static Boolean checkArrayContent(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
