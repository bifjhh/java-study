package com.heima_06;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *  把ArrayList集合中的字符串数据存储到文本文件
 *  每一个字符串元素作为文件中的一行数据
 *
 *  创建集合对象
 *  往集合中添加字符串元素
 *  创建输出缓冲流对象
 *  遍历集合对象,得到每一个字符串元素,然后把该字符串元素作为数据写入
 */

public class ArrayListToFile {
    public static void main(String [] args) throws IOException {
        // 创建集合对象

        ArrayList<String> array = new ArrayList<String>();

        // 往集合中添加字符串元素
        array.add( "hello" );
        array.add( "world" );
        array.add( "java" );

        // 创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter( new FileWriter( "array.txt" ) );

        // 遍历集合,将得到的字符串写入
        for (int i = 0; i < array.size(); i++) {
            String str = array.get( i );
            bw.write( str );
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
