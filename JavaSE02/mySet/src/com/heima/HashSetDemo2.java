package com.heima;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetDemo2 {
    public static void main(String[] args) {
        // 创建集合对象
        HashSet<Student> hs = new HashSet(  );
        // 创建元素对象
        Student s = new Student( "小明", 18 );
        Student s2 = new Student( "小白", 20 );
        Student s3 = new Student( "小白", 20 );
        // 添加元素对象
        hs.add( s );
        hs.add( s2 );
        hs.add( s3 );
        // 遍历集合对象
        for (Student stu : hs) {
            System.out.println( stu.toString() );
        }
    }
}


class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals( name, student.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, age );
    }
}