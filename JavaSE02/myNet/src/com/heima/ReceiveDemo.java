package com.heima;
/**
 * 使用UDP协议接收数据
 *      创建接收端 Socket 对象
 *      接收数据
 *      解析数据
 *      输出数据
 *      释放资源
 *
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        method();
    }

    private static void method() throws IOException {
        // 创建接收端
        DatagramSocket ds = new DatagramSocket( 8080 );
        // 接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive( dp );
//        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        // 解析数据
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        // 输出数据
        System.out.println( address.getHostAddress() );
        System.out.println( new String(data,0,length));
        // 释放资源
        ds.close();
    }
}
