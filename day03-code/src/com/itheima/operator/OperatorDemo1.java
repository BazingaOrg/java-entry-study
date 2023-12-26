package com.itheima.operator;

public class OperatorDemo1 {
    /*
        · 赋值运算符
            =
        · 扩展赋值运算符：内部自带强转效果
            +=
            -=
            *=
            /=
            %=
    */
    public static void main(String[] args) {
        short s = 1;
        s += 1;  // 等价于 s = (short) (s + 1)；
        System.out.println(s);

        double d = 12.3;
        int i = 10;
        i += d;
        System.out.println(i);  // 22
    }
}
