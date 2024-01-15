package com.itheima.test;

import java.util.ArrayList;

public class ArrayListTest4 {
    /*
     * 总结：在遍历集合的过程中，有删除操作
     *      1. 正序遍历：不要忘记 -- 操作
     *      2. 倒序遍历：不需要 -- 操作
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

//        for (int i = 0; i < list.size(); i++) {
//            if ("test".equals(list.get(i))) {
//                list.remove(i);
//                i--;
//            }
//        }

        for(int i = list.size() - 1; i >= 0; i--) {
            if ("test".equals(list.get(i))) {
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
