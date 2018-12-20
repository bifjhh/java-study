package com.heima;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 异常: 是指在运行时或者是编译时出现的问题
 * <p>
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at com.heima.ExceptionDemo.main(ExceptionDemo.java:8)
 * <p>
 * 异常信息: 包含了错误的类型,原因及出现错误的位置
 * 异常的体系结构:
 * Throwable(最顶层)
 * Error: 出现的不能够处理的错误
 * Exception: 出现的是一些可以处理的错误
 * 异常的处理方式:
 * jvm(java虚拟机): 如果我们没有处理异常,jvm会帮我们进行处理,会将错误类型,原因,及位置显示在命令行,以便修改.并且会终止程序的运行
 * 自己处理异常:
 * 捕获异常: try...catch语句
 * try {
 * // 有可能出现异常的代码
 * } catch (ArithmeticException err) {
 * // 当出现问题时进行处理的函数
 * }
 * <p>
 * 抛出: 当我们不想处理异常的时候,我们可以抛出异常,谁调用方法谁处理异常
 * 使用关键字throws 抛出
 * <p>
 * 如何处理多个异常
 * 可以使用try...catch 语句
 * 使用多个catch 处理异常
 * 多个catch之间的顺序:
 * 多个catch之间可以有字父类
 * 评级之间没有顺序关系
 * 如果有子父类,父类必须放在后面
 *
 * finally: 组合try...catch 使用,用于释放资源等收尾工作
 *  try {
 *      // 可能出现问题的代码
 *  } catch () {
 *      // 处理异常
 *  } finally {
 *      // 释放资源,清理垃圾
 *  }
 *
 *  异常的分类:
 *      运行时异常: RuntimeException的子类就是运行时的异常,可以选择处理与不处理
 *      编译时异常: 是Exception的子类,非RuntimeException的子类.在编译时期必须处理,否则无法执行
 */
public class ExceptionDemo {
    public static void main(String[] args) {
//        tryCatch();
//        fn();
//        throwsDemo();
//        getFinally();
        FileWriter fw = null;

        try {
            fw = new FileWriter( "./test.txt" );
            fw.write( "hello\r\n" );
            fw.write( "world\r\n" );
            System.out.println( 2/0 );
            fw.write( "java\r\n" );

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void getFinally() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException err) {
            System.out.println( err );
        } finally {
            System.out.println( "结束了" );
        }
    }

    private static void throwsDemo() {
        try {
            String s = null;
            System.out.println( s.length() );

            int[] arr = new int[5];
            System.out.println( arr[8] );

        } catch (Exception err) {
            // 原因
            System.out.println( err.getMessage() );
            // 返回类型和原因
            System.out.println( err.toString() );
            // 类型和原因位置
//            err.printStackTrace();
        }
    }

    public static void fn() throws IOException {
        FileWriter fw = new FileWriter( "./test.txt" );

    }

    private static void tryCatch() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException err) {
            System.out.println( err );
        }
    }
}
