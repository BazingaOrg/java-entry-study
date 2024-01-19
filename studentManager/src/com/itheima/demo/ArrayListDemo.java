package com.itheima.demo;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Student s1 = new Student("heima001", "张三", 18, "1990-01-01");
        Student s2 = new Student("heima002", "李四", 18, "1990-01-01");
        Student s3 = new Student("heima003", "王五", 18, "1990-01-01");

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的学生id：");

        String findId = sc.nextLine();
        int findIndex = getIndex(findId, list);
        System.out.println(findIndex);
    }

    private static int getIndex(String id, ArrayList<Student> list) {
        int findIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (id.equals(s.getId())) {
                findIndex =  i;
            }
        }
        return findIndex;
    }
}
