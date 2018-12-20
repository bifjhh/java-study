package com.heima_05;

import java.io.*;

/**
 * 缓冲流对象的特殊功能
 * 复制
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader( new FileReader( "FileWriteDemo.java" ) );
        // 创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter( new FileWriter( "Copy.java" ) );

        String line;
        while ((line=br.readLine())!=null){
            bw.write( line );
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}