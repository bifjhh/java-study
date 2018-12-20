package com.heima;

import java.io.File;
import java.io.IOException;

/**
 * File: 文件和目录名的抽象表示形式 File 类的实例是不可变的
 * 构造方法:
 *
 *   File(File parent, String child)  根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
 *   File(String pathname)  通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 *   File(String parent, String child)  根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 *
 * File的常用功能
 *  创建
 *  删除
 *  获取
 *  判断
 *
 *
 *
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File( "./test.txt" );
        File f = new File( "test2.txt" );
//        File f1 = new File( "./", "test.txt" );
        File parent = new File( "./" );
//        File f2 = new File( parent, "test.txt" );
        f.createNewFile();

    }
}
