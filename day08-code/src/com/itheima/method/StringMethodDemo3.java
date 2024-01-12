package com.itheima.method;

public class StringMethodDemo3 {
    /*
     * String类的截取方法：
     *      public String substring(int beginIndex): 从指定索引处截取字符串，截取到字符串的末尾，返回一个新的字符串
     *      public String substring(int beginIndex, int endIndex): 从指定索引处截取字符串，截取到指定索引处（包含左边，不包含右边），返回一个新的字符串
     */
    public static void main(String[] args) {
        String str = "itheima";
        String result = str.substring(1, 3);
        System.out.println(result);
    }

    private static void method() {
        String str = "itheima";
        String result = str.substring(2);
        System.out.println(result);
    }
}
