package com.itheima.method;

public class StringMethodDemo5 {
    /*
     * String类的切割方法：
     *      public String[] split(String regex)：根据传入的字符串作为规则，切割当前字符串
     *      建议：先正常指定切割规则，后来发现没有得到自己要的效果，就可以尝试在规则面前，加入 \\
     */
    public static void main(String[] args) {
        String str = "192.168.1.1";
        String[] chars = str.split("\\.");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
