package com.itheima.oop;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "小米";
        phone1.color = "白色";
        phone1.price = 4999;
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone1.call("雷军");

        System.out.println("-----------");

        Phone phone2 = new Phone();
        phone2.brand = "华为";
        phone2.color = "黑色";
        phone2.price = 6999;
        System.out.println(phone2.brand);
        System.out.println(phone2.color);
        System.out.println(phone2.price);
        phone2.call("任正非");
    }
}
