package com.itheima.test;

public class ForTest {
    public static void main(String[] args) {
//        printHeima(10);
//        getSum(100);
//        int count = daffodilNumber();
//        System.out.println(count);
        nineNineTable();
    }

    public static void printHeima(int n) {
        if (n < 0) {
            System.out.println("传入的参数错误");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("黑马程序员");
            }
        }
    }

    public static void getSum(int n) {
        int sum = 0;

        if (n < 2) {
            System.out.println("传入的参数错误");
        } else {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("1到" + n + "之间的偶数和为：" + sum);
        }
    }

    public static int daffodilNumber() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int individualNum = i % 10;
            int tenNum = (i % 100) / 10;
            int hundredNum = i / 100;
            if ((Math.pow(individualNum, 3) + Math.pow(tenNum, 3) + Math.pow(hundredNum, 3)) == i) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void nineNineTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
