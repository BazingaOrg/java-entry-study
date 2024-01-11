package com.itheima.string;

public class StringDemo2 {
    /*
     *    String类的常见构造方法：
     *        public String(): 创建一个空白字符串，里面不包含任何内容
     *        public String(char[] chs): 根据传入的字符数组，创建字符串对象
     *        public String(String original): 根据传入的字符串，创建字符串对象
     */
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);

        char[] chs = {'a', 'b', 'c'};
        String str2 = new String(chs);
        System.out.println(str2);

        String str3 = new String("abc");
        System.out.println(str3);
    }
}
