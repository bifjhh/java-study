package com.util;

import com.mysql.jdbc.Statement;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    static String driverClass = null;
    static String URL = null;
    static String USER = null;
    static String PASSWORD = null;

    static {
        try {
            // 1. 创建一个属性配置对象
            Properties properties = new Properties();
//            InputStream is = null;
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream( "jdbc.properties" );
            properties.load( is );
            driverClass = properties.getProperty( "driverClass" );
            URL = properties.getProperty( "URL" );
            USER = properties.getProperty( "USER" );
            PASSWORD = properties.getProperty( "PASSWORD" );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeAll(ResultSet res, Statement st, Connection conn) {
        closeRes( res );
        closeSt( st );
        closeConn( conn );
    }
    public static void closeAll(Connection conn, Statement st ) {
        closeSt( st );
        closeConn( conn );
    }

    public static Connection getConnn() {
        Connection conn = null;
        try {
//            DriverManager.registerDriver( new com.mysql.jdbc.Driver() );
            // 1. 注册驱动
//            Class.forName( "com.mysql.jdbc.Driver" );
            // 2. 建立连接

            conn = DriverManager.getConnection( URL, USER, PASSWORD );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    private static void closeRes(ResultSet res) {
        try {
            if (res != null) {
                res.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            res = null;
        }
    }

    private static void closeSt(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            st = null;
        }
    }

    private static void closeConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }
}
