package com.itheima.control;

import java.util.Scanner;

public class ContorlDemo {
    public static void main(String[] args) {
        initMenu();
    }

    public static void initMenu() {
        Scanner sc = new Scanner(System.in);

        lo:  // 标号
        while (true) {
            System.out.println("请输入您的选择：1. 添加学生；2. 删除学生；3. 修改学生；4. 查找学生；5. 退出菜单；");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("添加学生逻辑开始执行...");
                    break;
                case 2:
                    System.out.println("删除学生逻辑开始执行...");
                    break;
                case 3:
                    System.out.println("修改学生逻辑开始执行...");
                    break;
                case 4:
                    System.out.println("查找学生逻辑开始执行...");
                    break;
                case 5:
                    System.out.println("感谢使用");
                    break lo;
                default:
                    System.out.println("输入的参数有误，请重新输入");
                    break;
            }
        }
    }
}
