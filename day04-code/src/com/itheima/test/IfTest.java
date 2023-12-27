package com.itheima.test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        boolean isPasswordValid = checkPassword();

        if (isPasswordValid) {
            System.out.println("密码正确");
            checkStudentGrades();
        } else {
            System.out.println("密码错误");
        }
    }

    public static boolean checkPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        int inputPassword = sc.nextInt();

        return inputPassword == 123456;
    }

    public static void checkStudentGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int inputGrades = sc.nextInt();

        if (inputGrades > 100 || inputGrades < 0) {
            System.out.println("成绩输入错误");
        } else if (inputGrades >= 95) {
            System.out.println("奖励一辆自行车");
        } else if (inputGrades >= 90) {
            System.out.println("奖励一次游乐场");
        } else if (inputGrades >= 85) {
            System.out.println("奖励一个变形金刚");
        } else if (inputGrades >= 60) {
            System.out.println("没有奖励");
        } else if (inputGrades >= 0) {
            System.out.println("下次努力");
        }
    }
}
