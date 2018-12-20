package com.heima_06;

import java.io.*;
import java.util.ArrayList;

public class FileToArrayList {
    public static void main(String [] args) throws IOException {
        // 创建集合对象

        ArrayList<String> array = new ArrayList<String>();

        // 往集合中添加字符串元素
//        array.add( "hello" );


        // 创建输出缓冲流对象
        BufferedReader br = new BufferedReader( new FileReader( "array.txt" ) );
        // 遍历集合,将得到的字符串写入
        String lin;
        while ((lin=br.readLine())!=null){
            array.add( lin );
        }

        br.close();
        System.out.print( array.size() );
    }
}
