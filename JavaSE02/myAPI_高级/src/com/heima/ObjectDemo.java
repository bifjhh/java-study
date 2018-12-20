package com.heima;

import java.util.Objects;

/**
 *
 * String toString()
 * boolean equals()
 */
public class ObjectDemo {
    public static void main(String[] args){
        Student s = new Student();
//        System.out.println( s.toString() );
        s.name = "小明";
        s.age = 20;
//        System.out.println( s.toString() );
        System.out.println( s.name.equals( "小明" ) );
        System.out.println( s.name == "小明"  );


    }
}

class Student extends Object  {
    String name;
    int age;
//    public String toString(){
//        return  name + "@" + age;
//    }


//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals( name, student.name );
    }
}