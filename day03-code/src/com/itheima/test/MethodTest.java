package com.itheima.test;

public class MethodTest {
    /*
        · 方法没有被调用的时候，在方法区中的字节码文件中存放；
        · 方法被调用的时候，需要进入到栈内存中运行；
    */
    public static void main(String[] args) {
        System.out.println("开始");

        int max = getMax(10, 20);
        System.out.println(max);

        System.out.println("结束");
    }

    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
