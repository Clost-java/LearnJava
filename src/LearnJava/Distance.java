package LearnJava;

public class Distance {
    public static double CountDis(int x1,int x2,int y1,int y2){

        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }
    public static void main(String[] args) {
        System.out.println(CountDis(3, 2, 1, 2));
    }
}
