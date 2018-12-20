package com.heima;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * 需求: 实现学号和姓名 这样有对应关系的数据存储
 *
 * Map: 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值
 *
 * Map和Collection的区别
 *  Map: 是一个双列集合,常用处理有对应关系的数据(键值对)
 *  Collection: 是一个单列集合,(数组)
 *
 * Map常用方法:
 *
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<Student, String>();
        //  V	put(K key, V value) 就是将 key 映射到value, 如过 key 存在,则覆盖value,并将原来的值返回
//        System.out.println( map.put( "001","小明" ) );
//        System.out.println( map.put( "002","小黑" ) );
//        System.out.println( map.put( "002","小白" ) );
//        System.out.println( map);

        //  boolean	containsKey(Object key) 判断指定的 key 是否存在
//        System.out.println( map.containsKey( "001" ));
        //  boolean	containsValue(Object value) 判断指定的 value 是否存在
//        System.out.println( map.containsValue( "001" ));
//        System.out.println( map.containsValue( "小黑" ));
//        map.clear();// 清空所有的对应关系
        // map.isEmpty() 判断是否有对应关系,如果有则为false, 没有则为true
//        System.out.println( map.isEmpty());
//        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
//        System.out.println( keys );
//        System.out.println( values );
//        getForm( map );
//        getEntry( map );
        getObject( map );

    }

    private static void getObject(HashMap<Student, String> map) {
        Student s = new Student( "小米",10 );
        Student s2 = new Student( "苹果",15 );
        Student s3 = new Student( "苹果",15 );
        map.put( s,"小明" );
        map.put( s2,"小白" );
        map.put( s3,"小黑" );
        Set<Student> keys = map.keySet();
        for(Student stu:keys) {
            System.out.println( stu + "\t" + map.get( stu ) );
        }
    }

    private static void getEntry(Map<String, String> map) {
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries) {
            System.out.println( entry.getKey()+ "\t\t" + entry.getValue() );
        }
    }

    private static void getForm(Map<String, String> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println( key +"\t" + map.get( key ) );
        }
    }

}



