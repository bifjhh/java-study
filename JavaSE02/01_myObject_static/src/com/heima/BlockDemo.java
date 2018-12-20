package com.heima;

/**
 * 代码块
 */
public class BlockDemo {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println( i );
        }
        // 代码块内的变量,在代码块外无法访问
//        System.out.println( i );
    }
}
