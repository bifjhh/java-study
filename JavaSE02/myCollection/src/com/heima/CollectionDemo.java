package com.heima;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList(  ); // 多态,父类引用指向子类

        System.out.println( c.add( "hello" ) ); // 永远可以添加成功,允许重复
        System.out.println( c.add( "world" ) );
        System.out.println( c.add( "java" ) );
//        c.clear(); // 清除集合中所有元素
        System.out.println( c );
        System.out.println( c.contains( "hello" ) ); // 判断集合中是否有某一元素
        System.out.println( c.remove( "java" ) ); // 判断集合中是否有某一元素
        System.out.println( c );
//        c.toArray() 将集合转换成一个object数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println( objs[i] );
        }
    }
}
