package LearnJava;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {


        boolean key;
        int candy = 0, chocolate = 0, popcorn = 0, juice = 0;
        do {
            System.out.println("========小猪牌自动售货机========");
            System.out.println("1.口香糖");
            System.out.println("2.巧克力");
            System.out.println("3.爆米花");
            System.out.println("4.果汁");
            System.out.println("5.显示购买总数");
            System.out.println("6.退出");

            Scanner sc = new Scanner(System.in);
            int choice;
            choice = sc.nextInt();
            key = true;
            switch (choice) {
                case 1: {
                    System.out.println("您购买了口香糖");
                    candy++;
                    break;
                }
                case 2: {
                    System.out.println("您购买了巧克力");
                    chocolate++;
                    break;
                }
                case 3: {
                    System.out.println("您购买了爆米花");
                    popcorn++;
                    break;
                }
                case 4: {
                    System.out.println("您购买了果汁");
                    juice++;
                    break;
                }
                case 5: {
                    System.out.println(candy > 0 ? "您购买了" + candy + "个口香糖" : "");
                    System.out.println(chocolate > 0 ? "您购买了" + chocolate + "块巧克力" : "");
                    System.out.println(popcorn > 0 ? "您购买了" + popcorn + "桶爆米花" : "");
                    System.out.println(juice > 0 ? "您购买了" + juice + "杯果汁" : "");
                    break;
                }
                case 6: {
                    key = false;
                    break;
                }
                default: {
                    System.out.println("输入有误,请检查!");
                    break;
                }
            }
            System.out.println("您已成功退出!");

        } while (key);

    }
}
