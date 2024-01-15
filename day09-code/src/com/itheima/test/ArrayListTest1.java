package com.itheima.test;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        iterateOverArrayList();
    }

    private static void iterateOverArrayList() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
