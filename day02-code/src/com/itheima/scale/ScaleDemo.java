package com.itheima.scale;

public class ScaleDemo {
    /*
        计算机中进制的分类：
            · 十进制：默认
            · 二进制：0b开头
            · 八进制：0开头
            · 十六进制：0x开头

        原码、反码和补码
            · 原码：
                数据的二进制体现形式，一个字节由 8 个二进制位组成
                高位：二进制数据中，最左侧的数据，通过高位代表符号为
                    0 代表正数
                    1 代表负数
                弊端：遇到负数运算，可能会出现错误
            · 反码：
                正数的反码与其原码相同
                负数的反码是对其原码逐位取反，但符号位除外
            · 补码：
                正数的补码与其原码相同
                负数的补码是在其反码的末位加 1

        强转中的精度损失
        int a = 130;
        byte b = (byte) a;  // -126
        1. 整数 130：默认为 int，占 4 个字节，也就是 4 组 8 个二进制位，00000000 00000000 00000000 10000010
        2. 强转到 byte：4 个字节强制转换 1 个字节，就是砍掉前 3 组 8 个二进制位，10000010
        3. 根据运算后的补码，反推出原码，10000010 => 11111101 => 11111110
    */
    public static void main(String[] args) {
        int num1 = 110;
        int num2 = 0b110;
        int num3 = 0110;
        int num4 = 0x110;
    }
}