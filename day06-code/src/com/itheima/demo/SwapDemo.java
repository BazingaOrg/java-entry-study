package com.itheima.demo;

public class SwapDemo {
    /*
        ^ 异或：1. 相同为 0，不同为 1；2. 一个数字，被另一个数字异或两次，这个数不变；
        异或操作运算过程：
            10 ^ 2:
                1. 将需要运算的数据，先转换为二进制数据：
                    10: 0000 1010
                     2: 0000 0010
                2. 相同为 0，不同为 1
                    0000 1010
                  ^ 0000 0010
                  ------------
                    0000 1000
                3. 最后，将二进制数据转换为十进制数据：
                     8: 0000 1000
    */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
