package LearnJava;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        System.out.printf("请输入要转换的10进制数字:");
        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt();
        int v = 1;
        while(v <= num / 2){
            v *= 2;
        }
        System.out.print("转换后的二进制为：");
        while(v > 0){

            if(num < v){
                System.out.print(0);
            }else {
                System.out.print(1);
                num -= v;
            }

            v /=2;
        }

    }
}
