package com.heima_03;

        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;

/**
 * 把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 *
 *
 */
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException{
        // 创建输入流对象
        FileReader fr = new FileReader("FileWriteDemo.java");

        // 创建输出流对象
        FileWriter fw = new FileWriter("Copy2.java");

        // 读写数据
        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }
}

