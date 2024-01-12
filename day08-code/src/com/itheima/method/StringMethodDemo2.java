package com.itheima.method;

public class StringMethodDemo2 {
    /*
     *  String类用于遍历的方法：
     *      public char[] toCharArray(): 将字符串转为字符数组
     *      public char charAt(int index): 获取指定索引处的字符
     *      public int length(): 获取字符串的长度
     */
    public static void main(String[] args) {
        print2();
    }

    /*
     * 字符串的第一种遍历方式
     */
    private static void print1() {
        String str = "itheima";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    /*
     * 字符串的第二种遍历方式
     */
    private static void print2() {
        String str = "itheima";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
