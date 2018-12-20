package com.heima;

public class StaticDemo2 {
    public static void main(String[] args){
        Student.graduateFrom = "001";
        Student.study();


    }
    static class Student {
        String name;
        int age;
        static String graduateFrom;

        public static void study(){
//            System.out.println(graduateFrom );
//            sleep();

//            System.out.println(name);

        }

        public static void sleep(){
            System.out.println("sleep");
        }

    }
}
