package com.itheima.method;

public class StringMethodDemo4 {
    /*
     * String类的替换方法
     *      public String replace(CharSequence target, CharSequence replacement): 将字符串中的oldStr替换为newStr，返回一个新的字符串
     */
    public static void main(String[] args) {
        String str = "itheima";
        String result = str.replace("heima", "baima");
        System.out.println(result);
    }
}
