package com.heima;

import sun.rmi.rmic.IndentingWriter;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 模拟用户登录
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        // 创建客户端Socket对象
        Socket s = new Socket( "sunkundeMacBook-Pro.local",8080);
        // 获取用户名密码
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println( "请输入用户名" );
        String userName =  br.readLine();
        System.out.println( "请输入密码" );
        String passWard =  br.readLine();

        // 获取输出流对象
//        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( s.getInputStream() ) );
        PrintWriter out = new PrintWriter( s.getOutputStream(),true );
        out.println( userName );
        out.println( passWard );
        // 接收返回数据
        BufferedReader serverBr = new BufferedReader( new InputStreamReader( s.getInputStream() ));
        String result = serverBr.readLine();
        System.out.println( result );
        // 释放资源
        s.close();

    }
}
