package com.heima_05;

import java.io.*;

/**
 * 缓冲流的特殊功能
 * BufferedWriter
 *  void newLine(): 写一个换行符--换行符由系统决定
 *
 * BufferedReader
 *  String reaLine() 一次读取一行数据,但是不读取换行符
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
      /*  BufferedWriter bw = new BufferedWriter( new FileWriter( "bw2.txt" ) );

        for(int x = 0; x <10; x++){
            bw.write( "hello"+x );
            bw.newLine();
//            bw.write( "\r\n" );
            bw.flush();
        }

        bw.close();*/
        BufferedReader br = new BufferedReader( new FileReader( "br.txt" ) );

//        String line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);

        String line;

        while ((line=br.readLine())!=null) {
            System.out.println( line );
        }

        br.close();

    }
}
