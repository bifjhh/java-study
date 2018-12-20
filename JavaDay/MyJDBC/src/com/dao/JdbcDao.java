package com.dao;

public interface JdbcDao {
    /**
     * findAll 查询所有
     */
    void findAll();

    /**
     * login 登陆
     */
    void login(int id, String name);

    /**
     * 插入数据
     */
    void insert(int id, String name, int age);

    /**
     * 插入数据
     */
    void delete(int id);
}
