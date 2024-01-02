package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = {5, 44, 33, 55, 22};
        int max = getMaxNum(arr);
        System.out.println("当前数组元素的最大值为：" + max);
        System.out.println("---------------");
        int[] grades = {100, 50, 20, 91, 90};
        dealStudentGrades(grades);
    }

    public static Integer getMaxNum(int[] arr) {
        if (arr.length != 0) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        } else {
            return null;
        }
    }

    public static void dealStudentGrades(int[] grades) {
        if (grades.length == 0) {
            return; // Handle empty array case
        }

        int min = grades[0];
        int max = grades[0];
        int sum = grades[0];
        int lowThanAvg = 0;

        for (int i = 1; i < grades.length; i++) {
            int currentGrade = grades[i];
            min = Math.min(min, currentGrade);
            max = Math.max(max, currentGrade);
            sum += currentGrade;
        }

        double avg = (double) sum / grades.length;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < avg) {
                lowThanAvg++;
            }
        }

        System.out.println("最大值：" + max + "；最小值：" + min + "；总成绩：" + sum +
                "；平均值：" + avg + "；低于平均值元素的个数：" + lowThanAvg);
    }
}
