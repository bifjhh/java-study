package com.heima;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 *
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        // 创建服务器端Socket 对象
        ServerSocket ss  = new ServerSocket( 8080 );
        // 监听
        Socket s = ss.accept();
        // 获取输入流对象
        BufferedReader br = new BufferedReader( new InputStreamReader( s.getInputStream() ) );
        String userName = br.readLine();
        String passWard = br.readLine();
        // 判断账户密码是否正常
        String response = "登陆失败";
        List<User> users = UserDB.getUsers();

        if (users.contains( new User( userName, passWard) )) {
            response = "登陆成功";
            System.out.println( response );
        }

        // 返回判断信息
        PrintWriter out = new PrintWriter( s.getOutputStream(),true );
        out.println(response);

        // 释放资源
        s.close();

    }
}
