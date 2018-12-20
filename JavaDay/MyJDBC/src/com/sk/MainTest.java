package com.sk;

import com.dao.JdbcDao;
import com.dao.impl.JdbcDaoImpl;

public class MainTest {
    public static void main(String[] args) {
        JdbcDao jdbcDao = new JdbcDaoImpl();
        jdbcDao.findAll();
    }

}
