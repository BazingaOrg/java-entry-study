package com.itheima.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*
     * ArrayList 常用成员方法：
     * 1. 增：
     *      public boolean add(E e) : 将指定的元素添加到此列表的尾部
     *      public void add(int index, E element) : 将指定的元素添加到此列表中的指定位置
     * 2. 删：
     *      public E remove(int index) : 根据索引做删除，返回被删除掉的元素
     *      public boolean remove(Object o) : 根据元素做删除，返回是否删除成功的状态
     * 3. 改：
     *      public E set(int index, E element) : 修改指定索引位置，为对应的元素，返回被覆盖掉的元素
     * 4. 查：
     *      public E get(int index) : 根据索引，获取集合中的元素
     *      public int size() : 获取集合中的元素的个数
     */
    public static void main(String[] args) {
        findMethod();
    }

    private static void findMethod() {
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("张三1");
        list1.add("张三2");
        list1.add("张三3");

        String result = list1.get(2);
        System.out.println(list1.size());
    }

    private static void setMethod() {
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("张三1");
        list1.add("张三2");
        list1.add("张三3");

        list1.set(1, "李四");
        System.out.println(list1);
    }

    private static void removeMethod() {
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("张三1");
        list1.add("张三2");
        list1.add("张三3");

        list1.remove(2);
        list1.remove("张三2");

        System.out.println(list1);
    }

    private static void addMethod() {
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("张三1");
        list1.add("张三2");
        list1.add("张三3");
        list1.add(1, "张三4");

        System.out.println(list1);
    }
}
