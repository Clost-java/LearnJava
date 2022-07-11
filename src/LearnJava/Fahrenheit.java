package LearnJava;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        boolean key = true;

        do{
            System.out.println("=======摄氏度华氏度相互转换======");
            System.out.println("1.摄氏度转华氏度");
            System.out.println("2.华氏度转摄氏度");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("请输入要转换的摄氏度");
                    double temperature = sc.nextDouble();
                    if(temperature < -273.15){
                        System.out.println("温度不能低于零度");
                        key = false;
                        break;
                    }
                    System.out.println(temperature + "对应的华氏度为" + ((double) 9 / 5) * temperature + 32);

                }
                case 2 -> {
                    System.out.println("请输入要转换的摄氏度");
                    double temperature = sc.nextDouble();
                    if (temperature < 459.67){
                        System.out.println("温度不能低于零度");
                        key = false;
                        break;
                    }
                    System.out.println(temperature + "对应的摄氏度为" + ((double) 9 / 5) * (temperature - 32));

                }
                case 3 -> key = false;
            }
            System.out.println("您已成功退出!");
        }while (key);
    }
}
