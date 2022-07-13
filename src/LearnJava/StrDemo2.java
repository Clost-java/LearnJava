package LearnJava;

import java.util.Arrays;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class StrDemo2 {
    public static void main(String[] args) {
        String a = "123";
        String b = "1232";
        String c = a + b;
        String s1 = "123abc123abc123abc";
        String[] split = s1.split("[a]+");
        System.out.println(Arrays.toString(split));






    }
}
