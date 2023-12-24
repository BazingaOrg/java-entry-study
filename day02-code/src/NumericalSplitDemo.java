import java.util.Scanner;

public class NumericalSplitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位整数：");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("输入错误，请输入一个三位整数。");
            return;
        }

        System.out.println("整数" + num + "的个位为：" + (num % 10) + "；十位为：" + ((num / 10) % 10) + "；百位为：" + ((num / 100) % 10));
    }
}
