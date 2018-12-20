package com.heima;

import java.util.LinkedList;
import java.util.List;

/**
 * 有序的(存储和读取是一致的)
 * 有整数索引
 * 允许重复的元素
 *
 * List
 * LinkedList
 * ArrayList
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(  );
        list.add( "hello" );
        list.add( "world" );
        list.add( "java" );

        list.addFirst( "top" );
        list.addLast( "foot" );
        System.out.println( list );

        System.out.println( getIndex(list, "java") );
        System.out.println( list.contains( "java" ) );
    }

    public static int getIndex(List list,Object other) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get( i );
            if (obj.equals( other )) {
                return i;
            }
        }

        return -1 ;
    }
}
