package com.itheima.operator;

public class OperatorDemo4 {
    /*
        短路逻辑运算符：
            · && 优先级比 || 高
            · ||
    */
    public static void main(String[] args) {
        int x = 4, y = 3;
        boolean result = ++x > 5 & y-- < 3;
        System.out.println(x);
        System.out.println(y);
        System.out.println(result);
    }
}
