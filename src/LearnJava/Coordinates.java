package LearnJava;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("请输入笛卡尔平面坐标系的值:");
        System.out.println("X = :");
        x = sc.nextInt();
        System.out.println("Y = :");
        y = sc.nextInt();
        if( x==0 && y==0){
            System.out.println("(" + x + "," + y + ")" + "is origin");
        }else if(x > 0 && y > 0){
            System.out.println("(" + x + "," + y + ")" + "is 1th quadrant");
        }else if(x < 0 && y >0){
            System.out.println("(" + x + "," + y + ")" + "is 2th quadrant");
        }else if(x < 0 && y < 0){
            System.out.println("(" + x + "," + y + ")" + "is 3th quadrant");
        }else if(x > 0 && y < 0){
            System.out.println("(" + x + "," + y + ")" + "is 4th quadrant");
        }else if(x == 0 || y != 0){
            System.out.println("(" + x + "," + y + ")" + "is on x-axis");
        }else {
            System.out.println("(" + x + "," + y + ")" + "is on y-axis");
        }

    }
}
