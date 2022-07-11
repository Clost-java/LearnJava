package LearnJava;

import java.util.Scanner;

public class IntegerANDDecimal {
    public static void main(String[] args) {
        System.out.println("请输入一个小数:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int IntergerNum = (int)num;
        double Decimal = num - IntergerNum;
        System.out.println("整数部分是 "+ IntergerNum + "小数部分是" + Decimal);

    }
}
