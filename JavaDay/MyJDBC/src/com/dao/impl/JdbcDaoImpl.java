package com.dao.impl;

import com.dao.JdbcDao;
import com.mysql.jdbc.Statement;
import com.util.JDBCUtil;

import java.sql.*;

public class JdbcDaoImpl implements JdbcDao {
    @Override
    public void findAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet res = null;
        try {
            conn = JDBCUtil.getConnn();
            st = (Statement) conn.createStatement();
            res = st.executeQuery( "SELECT * FROM jdbc" );
            while (res.next()) {
                System.out.println(
                        "id:\t" + res.getString( "id" ) + "\t\t" + "name:\t" + res.getString( "name" )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll( res, st, conn );
        }

    }

    @Override
    public void login(int id, String name) {
        Connection conn = null;
        Statement st = null;
        ResultSet res = null;
        try {
            conn = JDBCUtil.getConnn();
            // 预先对SQL语句执行校验, ? 对应的内容,后面不管传递什么进来,都会认为是个变量
            PreparedStatement ps = conn.prepareStatement( "SELECT * FROM jdbc WHERE id=? AND name=? " );
            ps.setInt( 1, id );
            ps.setString( 2, name );
            res = ps.executeQuery();
            if (res.next()) {
                System.out.println( "存在" );
            } else {
                System.out.println( "没有该用户" );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll( res, st, conn );
        }

    }

    @Override
    public void insert(int id, String name, int age) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConnn();
            ps = conn.prepareStatement( "INSERT INTO jdbc VALUES(?,?,?);" );
            ps.setInt( 1, id );
            ps.setString( 2, name );
            ps.setInt( 3, age );
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println( "添加成功" );
            } else {
                System.out.println( "添加失败" );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll( conn, (Statement) ps );
        }
    }

    @Override
    public void delete(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConnn();
            ps = conn.prepareStatement( "DELETE FROM jdbc WHERE id=?;" );
            ps.setInt( 1, id );
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println( "删除成功" );
            } else {
                System.out.println( "删除失败" );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll( conn, (Statement) ps );
        }
    }
}
