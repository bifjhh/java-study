package com.heima;

import java.io.IOException;
import java.net.*;

/**
 *  使用UDP协议发送数据
 *      创建发送端 Socket 对象
 *      创建数据并打包
 *      发送数据
 *      释放资源
 *
 *  DatagramSocket 此类表示用来发送和接收数据
 *  DatagramPacket 此类表示数据包
 *  数据: byte[]
 *  接收地址 ip
 *  进程地址 端口号
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
//        method();
        DatagramSocket ds = new DatagramSocket(  );
        byte[] bys = "hello world!!!".getBytes();
        DatagramPacket dp = new DatagramPacket(
                bys,
                bys.length,
                InetAddress.getByName( "sunkundeMacBook-Pro.local" ),
                8080);
        ds.send( dp );
        //      释放资源
        ds.close();

    }

    private static void method() throws IOException {
        //      创建发送端 Socket 对象
        DatagramSocket ds = new DatagramSocket(  );
        //      创建数据并打包
        String str = "hello world";
        byte[] bys = str.getBytes();
        InetAddress address = InetAddress.getByName( "sunkundeMacBook-Pro.local" );
        int port = 8080;

        //      发送数据
        DatagramPacket dp = new DatagramPacket(bys, bys.length, address, port);
        ds.send( dp );
        //      释放资源
        ds.close();
    }
}
