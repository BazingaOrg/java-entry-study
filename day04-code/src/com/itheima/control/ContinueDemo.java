package com.itheima.control;

public class ContinueDemo {
    /*
        continue：跳过（只能在循环中调用）
        break和continue的共同注意事项：语句后面的代码无效（不执行）
    */
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        for (int i = 1; i < 30; i++) {
            if(i == 7 || i == 14 || i == 21) {
                continue;
            }
            System.out.println("第" + i + "名顾客持48小时内核酸证明进入电影院...");
        }
    }
}
