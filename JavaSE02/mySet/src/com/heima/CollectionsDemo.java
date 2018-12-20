package com.heima;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 面试: Collection 与 Collections 有什么区别?
 * Collection 是集合体系的最顶层,包含了集合体系的共性
 * Collections 是一个工具类,方法都是用于操作 Collection
 */
public class CollectionsDemo {
    public static void main(String[] args) {

        /**
         * 写一个发扑克牌的小demo
         *  1. 创建一副牌
         *  2. 洗牌
         *  3. 发牌
         *
         */

        String[] arr = {"♠️", "♥️", "♦️", "♣️"};
        ArrayList<String> box = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 13; j++) {
                if (j == 0) {
                    box.add( arr[i] + "A" );
                    continue;
                }
                if (j == 10) {
                    box.add( arr[i] + "J" );
                    continue;
                }
                if (j == 11) {
                    box.add( arr[i] + "Q" );
                    continue;
                }
                if (j == 12) {
                    box.add( arr[i] + "K" );
                    continue;
                }
                box.add( arr[i] + (j + 1) );
            }
        }

        box.add( "大王" );
        box.add( "小王" );
        Collections.shuffle( box ); //
//        System.out.println( box.size() );
//        System.out.println( box );

        ArrayList<String> box1 = new ArrayList<String>();
        ArrayList<String> box2 = new ArrayList<String>();
        ArrayList<String> box3 = new ArrayList<String>();
        for (int i = 0; i < box.size() - 3; i++) {
            if (i % 3 == 0) {
                box1.add( box.get( i ) );
            } else if (i % 3 == 1) {
                box2.add( box.get( i ) );
            } else if (i % 3 == 2) {
                box3.add( box.get( i ) );
            }
        }

        System.out.println( box1 );
        System.out.println( box2 );
        System.out.println( box3 );

        for (int i = box.size()-3; i <box.size() ; i++) {
            System.out.println( box.get( i ) );
        }
    }
}

