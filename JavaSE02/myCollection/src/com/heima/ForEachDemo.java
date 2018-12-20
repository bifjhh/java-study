package com.heima;

import java.util.ArrayList;
import java.util.Collection;

/**
 * foreach : 增强for循环 一般用于遍历集合或者数组
 *  格式:
 *      for(元素的类型变量: 集合或者数组变量) {
 *          可以直接用变量
 *      }
 */
public class ForEachDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList(  );

        c.add("hello");
        c.add("world");
        c.add("java");

//        for (Object obj : c) {
//            System.out.println( obj );
//        }
        for (String s : c) {
            System.out.println( s.toUpperCase() );
        }


    }
}
