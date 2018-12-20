package com.heima_03;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求: 往文件中写数据
 *      写数据 -- 输出流 -- FleWriter
 * FileWriter :
 *      FileWriter(String fileName);
 * 输出流写数据的步骤:
 *  1. 创建输出流对象
 *  2. 调用输出流对象的写数据的方法
 *  3. 释放资源
 *
 *
 */
public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        // 创建输出流对象
        FileWriter fw = new FileWriter("fileDemo.txt",true);
        /**
         * 创建输出流对象的过程
         *  1. 调用系统资源创建一个文件
         *  2. 创建输出流对象
         *  3. 将输出流对象指向文件
         */

        // 调用输出流对象的写数据的方法

        for(int i = 0; i < 10; i++) {
            fw.write("测试写入数据00" + i + ";");
            fw.write("\r\n");
        }
        // 数据没有直接写入文件,其实是写到了内存的缓冲区
//        fw.flush();

        // 释放资源
        fw.close();



    }
}
