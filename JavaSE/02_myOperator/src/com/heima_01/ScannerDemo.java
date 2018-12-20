package com.heima_01;

import java.util.Scanner;

/**
 * 为了提高程序的灵活性,可以把数据改为使用键盘录入,使用JDK提供的类 Scanner
 *
 * 使用步骤:
 *  1. 导包 import java.util.Scanner
 *  2. 创建键盘录入对象 Scanner sc = new Scanner(System.in);
 *  3. 接收数据 int i = sc.nextInt();
 *
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner( System.in );
//        System.out.println( "请输入:" );
//        int i = sc.nextInt();
//        System.out.println( "您输入的数字为"+i );

        // 求两个输入之和
//        System.out.println( "请输入第一个数字:" );
//        int a = sc.nextInt();
//        System.out.println( "请输入第二个数字:" );
//        int b = sc.nextInt();
//
//        System.out.println( "两个数字和为:" + (a+b) );

        // 求两个输入是否相等
//        System.out.println( "请输入第一个数字:" );
//        int a = sc.nextInt();
//        System.out.println( "请输入第二个数字:" );
//        int b = sc.nextInt();
//
//        System.out.println( a == b );

        // 求三个数据最大值
        System.out.println( "请输入第一个数字:" );
        int a = sc.nextInt();
        System.out.println( "请输入第二个数字:" );
        int b = sc.nextInt();
        System.out.println( "请输入第三个数字:" );
        int c = sc.nextInt();

        System.out.println( a>b?(a>c?a:c):(b>c?b:c) );


    }
}
