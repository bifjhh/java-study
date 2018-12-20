package com.heima;

import java.io.*;

/**
 * 标准输入流
 *  public static final InputStream in; 字节输入流,用来读取键盘输入的数据
 *      public static final int x;
 *      InputStream is = System.in;
 *      Scanner sc = new Scanner(System.in);
 * 标准输出流
 *  public static final PrintStream out; 字节输出流,将数据输出到命令行
 *
 */
public class IoDemo2 {
    public static void main(String[] args) throws IOException {
//        method();
//        method2();
        // 创建输入流对象
        BufferedReader br = new BufferedReader( new FileReader( "test.txt" ) );
        // 创建输出流对象
        Writer w = new OutputStreamWriter( System.out );
        BufferedWriter bw = new BufferedWriter( w );

        String line;
        while ((line=br.readLine())!= null){
            bw.write( line );
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    private static void method2() throws IOException {
        // 创建输入流对象
        BufferedReader br = new BufferedReader( new FileReader( "test.txt" ) );
        // 创建输出流对象
        Writer w = new OutputStreamWriter( System.out );


        String line;
        while ((line=br.readLine())!= null){
            w.write( line );
            w.write( "\r\n" );
        }
        w.close();
        br.close();
    }

    private static void method() throws IOException {
        // 创建输入流对象
        BufferedReader br = new BufferedReader( new FileReader( "test.txt" ) );
        // 创建输出流对象
        OutputStream os = System.out;

        String line;
        while ((line=br.readLine())!= null){
            os.write( line.getBytes() );
            os.write( "\r\n".getBytes() );
        }
        os.close();
        br.close();
    }
}
