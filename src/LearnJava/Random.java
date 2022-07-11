package LearnJava;

public class Random {
    public static void main(String[] args) {
        int[ ] nums = new int[10];
        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random() * 10);

            switch (random){
                case 0 -> nums[0]++;
                case 1 -> nums[1]++;
                case 2 -> nums[2]++;
                case 3 -> nums[3]++;
                case 4 -> nums[4]++;
                case 5 -> nums[5]++;
                case 6 -> nums[6]++;
                case 7 -> nums[7]++;
                case 8 -> nums[8]++;
                case 9 -> nums[9]++;

            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println( i + "出现的概率是:" + (double)nums[i] / 100);
        }

    }
}
