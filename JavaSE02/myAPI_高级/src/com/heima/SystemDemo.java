package com.heima;

import java.util.Arrays;

/**
 * static void arraycopy
 * static long currentTimeMillis
 * static void exit(int status)  停止虚拟机
 * static void gc()  运行垃圾回收器
 */

public class SystemDemo {
    public static void main(String[] args) {

//        method();
//        method2();
//        method3();
        new Demo();
        System.gc();




    }

    private static void method3() {
        for (int i = 0; i < 100; i++) {
            if (i==19){
                System.exit( 0 );
            }
        }
    }

    private static void method2() {
        /**
         *   currentTimeMillis(); 以毫秒值返回当前系统时间
         *  这个毫秒的时间是相对时间,相对于1970-1-1 00:00:00
         *
         */
        System.out.println( System.currentTimeMillis()/1000 );
    }

    private static void method() {
        /**
         *
         * arraycopy(Object src,  int  srcPos,Object dest, int destPos, int length);
         * 复制数组
         * src:源数组
         * int: 原数组起始位置
         * dest: 目标数组
         * destPos:目标数组的起始索引位置
         * length: 指定接收的元素的个数
         *
         */
        int[] src = {1,2,3,4,5};
        int[] dest = new int[5];

        System.arraycopy( src,2,dest,0,3 );

        System.out.println( Arrays.toString(dest) );
    }
}

class Demo {
    protected void finalize() throws Throwable {
        System.out.println( "回收机制执行了" );
    }
}