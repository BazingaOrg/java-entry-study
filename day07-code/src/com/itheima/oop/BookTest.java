package com.itheima.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.id = 1;
        book1.name = "三国演义";
        book1.price = 99.9;
        book1.show();

        Book book2 = new Book();
        book2.id = 2;
        book2.name = "红楼梦";
        book2.price = 88.8;
        book2.show();

        Book book3 = new Book();
        book3.id = 3;
        book3.name = "西游记";
        book3.price = 77.7;
        book3.show();
    }
}
