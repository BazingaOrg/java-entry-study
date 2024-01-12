package com.itheima.stringbuilder;

public class StringBuilderDemo3 {
    /*
     * StringBuilder常用成员方法：
     *      1. public StringBuilder append(任意类型)：添加数据，并返回对象自己
     *      2. public StringBuilder reverse(): 将缓冲区的内容，进行反转
     *      3. public int length(): 返回缓冲区的长度
     *      4. public String toString(): 将缓冲区的内容，转换为字符串类型
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 链式编程：调用的方法，返回的结果是对象，就可以继续向下调用方法；
        sb.append("红色").append("蓝色").append("黄色");
        System.out.println(sb);

        sb.reverse().append("你好");
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
}
