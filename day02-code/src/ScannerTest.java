import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的姓名：");
        String name = sc.next();

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入您的性别：");
        String gender = sc.next();

        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();

        System.out.println("请输入您的婚姻状况：");
        boolean isMarry = sc.nextBoolean();

        System.out.println("姓名：" + name + "；年龄：" + age + "；性别：" + gender + "；身高：" + height + "；婚姻状况：" + isMarry + "。\n注册成功！！" );
    }
}
