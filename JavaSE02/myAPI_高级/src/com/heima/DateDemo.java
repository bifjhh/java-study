package com.heima;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 表示特定的时间,精确到毫秒,他可以通过方法来设定自己所表示的时间,可以精确到任意的时间
 * System.currentTimeMillis():返回的是1970年1月1日00:00:00至今的毫秒值
 *
 * 构造方法:
 *      Date(): 创建的是一个表示当前系统时间的Date对象
 *      Date(long date) :根据指定时间创建Date对象
 *
 *
 */
public class DateDemo {
    public static void main(String[] args){
//        Date d = new Date(  );
//        System.out.println( d.toString() ); //Thu Nov 22 21:04:20 CST 2018
//        System.out.println( d.toLocaleString() );

        Date d2 = new Date();
//        d2.setTime( 1000*60*60*24 );
//        System.out.println( d2 );
//        System.out.println( d2.getTime() );
        SimpleDateFormat sd = new SimpleDateFormat( "yyyy年MM月dd日 HH:mm:ss" );

        System.out.println( sd.format( d2 ) );
        int a = new Integer("20");
        int b = Integer.parseInt( "20" );
        System.out.println( a );
        System.out.println( b );
    }
}
