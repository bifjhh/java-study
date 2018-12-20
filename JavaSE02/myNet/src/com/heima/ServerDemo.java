package com.heima;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  使用TCP协议接收数据
 *          创建接收端Socket对象
 *          监听(堵塞)
 *          获取输入流对象
 *          接收数据
 *          输出对象
 *          释放资源
 *
 *  ServerSocket: 接收端,服务端Socket
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建接收端Socket对象
        ServerSocket ss = new ServerSocket( 8080 );
        // 监听(堵塞)
        Socket s = ss.accept();
        // 获取输入流对象
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];
        int len;
        len = is.read(bys);
        String str = new String(bys,0,len).toUpperCase();
        // 获取输出流对象
        OutputStream os = s.getOutputStream();
        // 返回数据
        os.write( str.getBytes() );
        // 输出对象
        System.out.println( str +  s.getInetAddress().getHostName());

        // 释放资源
        s.close();
//        ss.close();





    }
}
