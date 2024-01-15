package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<Student>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        for (int i = 0; i < sList.size(); i++) {
            Student s = sList.get(i);
            if(s.getAge() < 18) {
                System.out.println(s.getName() + " - " + s.getAge());
            }
        }
    }
}
