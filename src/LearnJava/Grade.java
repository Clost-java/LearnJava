package LearnJava;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("=====跳水比赛评分======");

        Scanner sc = new Scanner(System.in);
        int[] grade = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("请输入第"+ i + 1 +"个评分(评分范围在1-10之间)");
            grade[i] = sc.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < i; j++){
                if(grade[i] > grade[j]){
                    int tem;
                    tem = grade[i];
                    grade[i] = grade[j];
                    grade[j] = tem;
                }
            }
        }

        for (int i = 1; i < grade.length - 1; i++) {
            sum += grade[i];
        }



    }
}
