package com.heima_04;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // 创建输入缓冲流对象
        BufferedReader br = new BufferedReader( new FileReader( "FileWriteDemo.java" ) );
        // 创建输出流对象
        BufferedWriter bw = new BufferedWriter( new FileWriter( "CopyBuffered.java" ) );

        // 读写数据
        // 一次读写一个字符
//        int ch;
//        while ((ch=br.read())!=-1){
//            bw.write( ch );
//        }
        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            bw.write( chs,0,len );
        }

        // 释放资源
        bw.close();
        br.close();

    }
}
