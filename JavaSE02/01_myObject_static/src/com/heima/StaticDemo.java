package com.heima;

/**
 * static 是一个关键字,用于修饰成员变量和方法
 * 特点:
 *      被所有的对象共享
 *      可以使用类名调用
 */
public class StaticDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "sk";
        p1.graduateFrom = "0001";
        p1.speak();

        Person p2 = new Person();
        p2.name = "xmj";
//        p2.graduateFrom = "0002";
        p2.speak();

    }

    static class Person {
        String name;
        int age;
        static String graduateFrom;

        public void speak(){
            System.out.println( name +"\t"+graduateFrom );
        }
    }
}
