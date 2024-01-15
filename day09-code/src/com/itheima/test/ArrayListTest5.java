package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        ArrayList<Student> newList = new ArrayList<Student>();

        Student s1 = new Student("张三", 16);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王五", 24);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getAge() < 18) {
                newList.add(s);
            }
        }

        for (int i = 0; i < newList.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "--" + s.getAge());
        }
    }
}
