package LearnJava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("halo" + i);
        }
        list.add(1,"韩顺平教育");
        list.get(4);
        list.remove(5);
        list.set(6,"韩顺平教育");


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);

        }
    }
}
