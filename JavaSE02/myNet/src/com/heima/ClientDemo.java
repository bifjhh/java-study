package com.heima;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 使用TCP协议发送数据
 *      创建发送端Socket对象(创建链接)
 *      获取输出流对象
 *      发送数据
 *      释放资源
 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket( InetAddress.getByName( "sunkundeMacBook-Pro.local" ) ,8080);
        // 获取输出流对象
        OutputStream os = s.getOutputStream();
        // 发送数据
        os.write( "hell tcp".getBytes() );
        // 获取输入流对象
        InputStream is = s.getInputStream();
        // 接收数据
        byte[] bys = new byte[1024];
        int len;
        len = is.read( bys );
        System.out.println( new String(bys,0,len) );

        s.close();
    }
}
