package com.heima;


/**
 * 数组数据结构: 查询方便,增删改麻烦
 * 链表数据结构: 方便增删改--不方便查询(需要遍历)
 *
 * 栈: 先进,后出
 * 队列: 先进 先出
 */

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.*;

/**
 * 集合的比那里方式
 *      1. toArray() 可以把集合转换成数组,然后遍历数组即可
 *      2. Iterator 可以返回一个迭代器对象,可以通过迭代器对象来遍历集合
 *          Iterator 是对 collection 进行迭代的迭代器
 *
 */

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList(); // 多态,父类引用指向子类
        List li = new ArrayList();
        c.add( "hello" ); // 永远可以添加成功,允许重复
        c.add( "world" );
        c.add( "java" );

        li.add( "hello" ); // 永远可以添加成功,允许重复
        li.add( "world" );
        li.add( "java" );

        ListIterator it = li.listIterator();
        while (it.hasNext()) {
            String s = (String)it.next();
            if ( s.equals( "java" )) {
                it.add( "android" );
            }
        }
        System.out.println( li );
//        method( c );

        // 获取迭代器
//        getIterator( c );

        // 判断集合内是否有某一个元素
//        ifName( c );

//        ifAddElement( c, "add" );
    }

    private static void ifAddElement(Collection c,String element) {
        Iterator it = c.iterator();
        boolean flag = false;
        while (it.hasNext()) {
           if ( it.next() == element) {
               flag = true;
           }
        }
        if (!flag) {
            c.add( element );
        }
        System.out.println( c );
    }

    private static void ifName(Collection c) {
        if (c.contains( "PHP" )){
            c.add( "PHP" );
        }
    }

    private static void getIterator(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println( it.next() );
        }
    }

    private static void method(Collection c) {
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println( objs[i] );
        }
    }
}
