package com.heima_01;

/**
 * 运算符: 就是用于对常量和变量进行操作的符号
 *
 * 表达式: 用运算符链接起来的符合Java语法的式子.不同的运算符链接起来的表达式是不同的表达式
 *      例如 a,b
 *          a+b
 *
 *  运算符分类:
 *      算数运算符
 *      赋值运算符
 *      关系运算符
 *      逻辑运算符
 *      三元运算符
 *
 *  算数运算符
 *      +, -, *, /, %, ++, --
 *
 *  %: 用于获取两个数据相除时候的余数
 *  /: 用于获取两个数据相除时候的商
 *
 *  字符参与加法运算,其实是拿字符在计算机中存储的数据值来参与运算的
 *  字符串参与加法运算,其实做的是字符串的拼接
 *
 *  赋值运算符
 *      基本赋值运算符: =
 *      扩展赋值运算符: +=, -=, *=, /=, ......
 *          扩展的赋值运算符隐含了强制类型转换
 *
 *  关系运算符: ==, !=, >, >=,
 *
 *  逻辑运算符
 *      &, |, !,  ^(逻辑异或:相同为false,不同为true--异或就是不同的意思)
 *      &&, ||
 *
 *  三元运算符
 *      关系表达式?表达式1:表达式2 1>2?true:false
 */


public class Operator {
    public Operator() {
    }

    public static void main(String[] args) {
        // +, -, *, /,的基本使用

        // 定义变量
//        int a = 3;
//        int b = 4;

//        System.out.println( a + b );
//        System.out.println( a - b );
//        System.out.println( a * b );
//        System.out.println( a / b );
//        // 整数相除,只能得到整数,要想得到小数,必须有浮点数参与运算
//        System.out.println( 3.0 / b );
//        System.out.println( b % a );
//        System.out.println( "-----自增与自减------" );
//        System.out.println( ++a );// 直接进行计算
//        System.out.println( --a );// 直接进行计算
//        System.out.println( a++ );// 运算之后在进行计算
//        System.out.println( a-- );// 运算之后在进行计算
//        System.out.println( a );
//
//        char c = 'A';
//
//        System.out.println( "-----字符参与加法运算------" );
//
//        System.out.println( a + c );
//        System.out.println( "-----字符串参与加法运算------" );
//        System.out.println( "我是" + a );
//        System.out.println( a + b + "我是");
//        System.out.println( "-----赋值运算符------" );
//
//        int a = 10;
//        System.out.println( a+=20 ); //等同于 a + 20
//        System.out.println( "-----逻辑运算符------" );
        System.out.println( "-----三元运算符------" );
        int a = 10;
        int b = 15;
        int c = 6;
        System.out.println( a>b?(a>c?a:c):(b>c?b:c) );


    }
}
