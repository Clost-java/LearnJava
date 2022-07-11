package LearnJava;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        System.out.println("请输入两个数字:");
        Scanner sc = new Scanner(System.in);
        int num1 ,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("猜一猜两个数字之和是多少呢!");
        int GusessN = sc.nextInt();
        if(GusessN == num1 + num2){
            System.out.println("恭喜你,猜对了!!!");
        }else {
            System.out.println("很遗憾，你猜错了");
        }
    }
}
