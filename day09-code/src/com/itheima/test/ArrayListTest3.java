package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<Student>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个学生信息：");
            addStudent(sList);
        }
    }

    private static void addStudent(ArrayList<Student> sList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String inputName = sc.next();
        System.out.println("请输入学生年龄：");
        int inputAge = sc.nextInt();

        Student s = new Student(inputName, inputAge);
        sList.add(s);
    }
}
