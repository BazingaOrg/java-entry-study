package com.itheima.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
