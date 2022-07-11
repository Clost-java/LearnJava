package LearnJava;

public class Fibonacci {
    public static int Fibonacci_(int num){
        if(num == 0){
            return 0;
        }else if(num <= 2){
            return 1;
        }else {
            return Fibonacci_(num - 1)  +  Fibonacci_(num - 2);
        }


    }
    public static void main(String[] args) {
        System.out.println(Fibonacci_(30));
    }
}
