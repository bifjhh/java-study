package com.heima;

/**
 * IO流分类:
 *      流向
 *          输入流     读取数据    FileReader
 *          输出流     写出数据    FileWriter
 *
 *      数据类型
 *          字节流
 *              字节输入流   读取数据    InputStream
 *              字节输出流   写出数据    OutputStream
 *          字符流
 *              字符输入流   读取数据    Reader
 *              字符输出流   写出数据    Writer
 */

import java.io.*;

/**
 * 使用字符流复制文本文件
 *
 * 二进制文件只能使用字节流进行复制
 * 文本文件的复制,既可以使用字符流,也可以使用字节流
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
//        method();
//        method2("MapDemo.java", "MapDemo2.java");
        return;
    }

    private static void method2(String origin,String target) throws IOException {
        // 创建字节输入流
        FileInputStream fis = new FileInputStream( origin );
        // 创建字节输出流
        FileOutputStream fos = new FileOutputStream( target);

        int len;
        byte[] bys = new byte[1024];
        while ((len=fis.read(bys))!=-1){
            fos.write( bys,0,len );
        }

        fos.close();
        fis.close();
    }

    private static void method() throws IOException {
        // 创建字符输入流对象
        FileReader fr = new FileReader( "MapDemo.java" );
        // 创建字符输出流对象
        FileWriter fw = new FileWriter( "mapDemoCopy.java" );

        // 一次读写一个字符
        int ch;
        while ((ch = fr.read())!= -1) {
            fw.write( ch );
            fw.flush();
        }

        // 一次读写一个字符数组
//        int len; //用于存储读取的字符的个数
//        char[] chs = new char[1024];
//        while ((len = fr.read(chs))!=-1){
//            fw.write( chs,0,len );
//            fw.flush();
//        }
        fw.close();
        fr.close();
    }
}
