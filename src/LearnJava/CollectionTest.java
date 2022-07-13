package LearnJava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog("小黑",2));
        list.add(new Dog("小白",4));
        list.add(new Dog("小黄",4));
        //使用增强for遍历，增强for可以用于数组和集合，底层实现仍然是迭代器
        System.out.println("增强for遍历:");
        for (Object dog :list) {
            System.out.println("dog=" + dog);
        }
        System.out.println("迭代器遍历");
        //使用迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println("dog=" + dog);
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
