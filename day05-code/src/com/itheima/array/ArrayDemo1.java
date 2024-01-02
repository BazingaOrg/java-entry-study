package com.itheima.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest2();
    }

    public static void arrayTest1() {
        int[] array1;
        int array2[];

        // System.out.println(array1);
        // System.out.println(array2);

        int a;
        // System.out.println(a);
    }

    /*
        打印数组名：
             array1: [I@a09ee92
             @: 分隔符
             [: 当前空间，是数组类型的
             I: 当前数组类型，是int类型
             a09ee92: 数组的十六进制地址
    */
    public static void arrayTest2() {
        int[] array1 = new int[]{11, 22, 33};
        double[] array2 = {111.1, 222.22, 333.333};

        System.out.println(array1);
        System.out.println(array2);
    }
}
