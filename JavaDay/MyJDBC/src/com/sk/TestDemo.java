package com.sk;

import com.mysql.jdbc.Statement;
import com.util.JDBCUtil;
import org.junit.Test;

import java.sql.*;

public class TestDemo {

    @Test
    public void test() {
        Connection conn = null;
        Statement st = null;
        ResultSet res = null;
        JDBCUtil ju = new JDBCUtil();

//        try {
//            conn = JDBCUtil.getConnn();
//            // 3. 创建statement , 用来操作数据库
//            st = (Statement) conn.createStatement();
//            // 4. 执行 SQL命令
////            st.executeUpdate( "DELETE FROM jdbc WHERE id>4;" );
////            int result = st.executeUpdate( "INSERT INTO jdbc VALUES(5,'test',10);" );
////            res = st.executeUpdate( "INSERT INTO jdbc VALUES(4,'test',10);" );
////            System.out.println( result );
//            res = st.executeQuery( "SELECT * FROM jdbc" );
//
//            // 5. 处理返回结果
//            while (res.next()) {
//                System.out.println(
//                        "id:\t" + res.getString( "id" ) + "\t\t" +
//                                "name:\t" + res.getString( "name" )
//                );
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // 6. 关闭资源
//            ju.closeAll( res, st, conn );
//        }
    }

}
