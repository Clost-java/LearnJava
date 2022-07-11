package LearnJava;

import java.util.Scanner;

public class OutputNum {

    public static void main(String[] args) {
        System.out.println("请输入一个四位数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num / 1000);
        System.out.println(num / 100 % 10);
        System.out.println(num % 100 / 10);
        System.out.println(num % 100 % 10);
    }
}
