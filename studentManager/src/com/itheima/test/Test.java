package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查看学生");
            System.out.println("5. 退出");
            System.out.println("请输入您的选择：");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStudentById(list);
                    break;
                case 3:
                    updateStudentInfoById(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见👋～");
                    System.exit(0); // 终止当前正在运行的JVM虚拟机
                    break;
                default:
                    System.out.println("您的输入有误!");
                    break;
            }
        }
    }

    /*
     * 此方法用于添加学生
     */
    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学生学号：");

        String id = "";
        while (true) {
            id = sc.next();
            int findIndex = getIndex(id, list);
            if (findIndex == -1) {
                break;
            } else {
                System.out.println("您输入的学号已被占用，请重新输入");
            }
        }

        System.out.println("请输入要添加的学生姓名：");
        String name = sc.next();
        System.out.println("请输入要添加的学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入要添加的学生生日：");
        String birth = sc.next();

        Student stu = new Student(id, name, age, birth);
        list.add(stu);
    }

    /*
     * 此方法用于根据学号修改学生信息
     */
    private static void updateStudentInfoById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生学号：");
        String id = sc.next();

        int findIndex = getIndex(id, list);
        if (findIndex == -1) {
            System.out.println("查无此人，修改失败");
        } else {
            System.out.println("请输入新的学生姓名：");
            String name = sc.next();
            System.out.println("请输入新的学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String birth = sc.next();

            Student stu = new Student(id, name, age, birth);
            list.set(findIndex, stu);
            System.out.println("修改成功！");
        }
    }

    /*
     * 此方法用于根据学号删除学生
     */
    private static void deleteStudentById(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学生学号：");
        String id = sc.next();

        int findIndex = getIndex(id, list);
        if (findIndex == -1) {
            System.out.println("查无此人，删除失败！");
        } else {
            list.remove(findIndex);
            System.out.println("删除成功！");
        }
    }

    /*
     * 此方法用于查看学生
     */
    private static void queryStudentInfos(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("查无信息，请添加后重试！");
        } else {
            System.out.println("学好\t\t\t姓名\t\t\t年龄\t\t\t生日\t\t\t");
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t\t\t" + s.getAge() + "\t\t\t" + s.getBirth());
            }
        }
    }

    /*
     * 此方法用于根据学号，去集合中查找对应的索引
     */
    private static int getIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (id.equals(s.getId())) {
                return i;
            }
        }
        return -1;
    }
}
