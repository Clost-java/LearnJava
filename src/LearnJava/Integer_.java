package LearnJava;

import java.util.Scanner;

public class Integer_ {
    public static void main(String[] args) {
        System.out.println("请输入一个小数:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int newNum;
        if(num - (int)num > 0.5){
            newNum = (int)num + 1;
        }else {
            newNum = (int)num;
        }
        System.out.println("和" + num + "最接近的整数是:" + newNum);
    }
}
