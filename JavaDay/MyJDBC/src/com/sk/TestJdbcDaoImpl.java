package com.sk;

import com.dao.JdbcDao;
import com.dao.impl.JdbcDaoImpl;
import org.junit.Test;

public class TestJdbcDaoImpl {
    JdbcDao dao = new JdbcDaoImpl();

    @Test
    public void testFindAll(){
        dao.findAll();
    }
    @Test
    public void testLogin() {
        dao.login( 1, "bifjhh" );
//        dao.login( 1, "bifjhh1 ' or ' 1=1" );
    }
    @Test
    public void testInsert(){
        dao.insert( 6, "bifjhh" , 24);
    }
    @Test
    public void testDelete(){
        dao.delete( 6);
    }
}
