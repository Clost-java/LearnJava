package LearnJava;

public class NewArray {
    public static void main(String[] args) {
        int[] oldArr = {1,3,5,1,1,6,6,1,5,7,6,7,1,5};
        int[] newArr = new int[9];
        for (int i = 0,j=0; i < oldArr.length; i++) {
            if(oldArr[i] != 1){
                newArr[j] = oldArr[i];
                j++;
            }
         }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
