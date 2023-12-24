import java.util.Scanner;
/*
    int age = sc.nextInt() 从键盘录入整数，并使用 int 类型变量接收
    double height = sc.nextDouble() 从键盘录入小数，并使用 double 类型变量接收
    boolean flag = sc.nextBoolean() 从键盘录入布尔，并使用 boolean 类型变量接收
    String name = sc.next() 从键盘录入字符串，并使用 String 类型变量接收
*/
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
    }
}
