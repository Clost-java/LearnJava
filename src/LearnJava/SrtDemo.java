package LearnJava;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class SrtDemo {
    public static void main(String[] args) {
        String str1 = "abc123";
        String str2 = new String("abc123");
        String str3 = "abc" + 123;
        System.out.println(str1 ==str3);

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
