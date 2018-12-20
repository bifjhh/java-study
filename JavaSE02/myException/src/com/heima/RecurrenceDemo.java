package com.heima;

/**
 * 求5的阶乘
 * 5! = 5*4*3*2*1 (阶乘的算法)
 *
 * 递归的注意事项:
 *  递归一定要有出口:否则会内存溢出
 *  递归次数不宜过多:否则会内存溢出
 */
public class RecurrenceDemo {
    public static void main(String[] args) {
//        System.out.println( getRecurrence( 5 ) );
        System.out.println( getRecurrence2( 7 ) );

    }

    public static int getRecurrence(int num) {
        if(num == 1) {
            return 1;
        } else {
            return num * getRecurrence(num -1);
        }
    }

    public static int getRecurrence2(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return getRecurrence2(n-1) + getRecurrence2(n-2);
        }
    }
}
