package LearnJava;

public class ReverseNum {
    public static int reverseDigit(int num){
        String Newnum = "";
        while (num != 0){
            Newnum +=  num % 10;
            num /= 10;
        }
        return Integer.parseInt(Newnum);
    }
    public static void main(String[] args) {

        System.out.println(reverseDigit(56789));
    }
}
