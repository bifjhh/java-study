package com.heima;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 集合
 * ArrayList<E>
 *     大小可变数组的实现
 *     <E>: 是一种特殊的地方我们使用引用数据类型替换
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner sc = new Scanner( System.in );

        // 增加
//        arr.add( "hello" );
//        arr.add( "world" );

        // 获取集合的长度
//        System.out.println( arr.size() );
//        System.out.println( arr.get( 1 ) );

        // 修改
//        arr.set( 0, "Hello" );
//        System.out.println( arr.get( 0 ) );

        // 删除
//        arr.remove( 1 );

        String name;
        int age;

        for (int i = 0; i <5 ; i++) {
            System.out.println( "请输入姓名" );
            name = sc.next();
            System.out.println( "请输入年龄" );
            age = sc.nextInt();
            arr.add( new Student( name,age ) );
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println( arr.get( i ).getName() +"\t"+ arr.get( i ).getAge() );
        }

    }

}
