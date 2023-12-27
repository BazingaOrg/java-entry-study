package com.itheima.myswitch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        switchTest1();
    }

    public static void switchTest1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();

        // switch()可以接收的类型：1. 基本数据类型：byte、short、char、int；2. 引用数据类型：jdk5版本开始可以是枚举，jdk7版本开始可以是String字符串；3. jdk14版本开始，case后面允许编写多个数据，多个数据之间使用逗号分隔；
//        switch (num) {
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            case 4:
//                System.out.println("星期四");
//                break;
//            case 5:
//                System.out.println("星期五");
//                break;
//            case 6:
//                System.out.println("星期六");
//                break;
//            case 7:
//                System.out.println("星期日");
//                break;
//            default:
//                System.out.println("输入的数字不合法！");
//                break;
//        }

        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("输入的数字不合法！");
        }
    }
}
