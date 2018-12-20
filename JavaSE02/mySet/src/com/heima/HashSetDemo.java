package com.heima;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *      使用HashSet 存储字符串并遍历
 *
 *      Set集合的特点
 *          1. 无序(存储和读取的顺序可能会不一致)
 *          2. 不允许重复
 *          3. 没有索引
 *
 */
public class HashSetDemo {
    public static void main(String[] args) {

        // 创建集合对象
//        HashSet<String> hs = new HashSet<String>(  );
        Set<String> set = new HashSet<String>(); // 父接口引用指向 子类 对象

        // 添加元素对象
        set.add( "hello" );
        set.add( "world" );
        set.add( "java" );


        // 遍历元素

        // 转数组
//        getArray( set );

        // 迭代器
//        getIterator( set );

        // foreach
        getForeach( set );
    }

    private static void getForeach(Set<String> set) {
        for (String e : set) {
            System.out.println( e );
        }
    }

    private static void getIterator(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println( it.next() );
        }
    }

    private static void getArray(Set<String> set) {
        Object[] objs = set.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println( objs[i] );
        }
    }
}
