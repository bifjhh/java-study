package com.heima;

import java.util.Arrays;
/**
 *
 * 数组: 存储同一种数据类型的多个元素容器
 *
 * 定义格式:
 *  1. 数据类型 [] 数组名--- int [] intArr;
 *  2. 数据类型 数组名 [] --- int intArr [];
 *
 * 数组的初始化
 *  1. 初始化 就是为数组开辟内存空间,并未数组中的每个元素赋予初始值
 *      动态初始化   只给出长度,由系统给出初始化值
 *      静态初始化   给出初始化值,由系统决定长度
 *
 * Java中的内存分配:
 *      栈:存储的是局部变量(定义在方法里的变量)
 *      堆:存储的是new出来的
 *      方法区:
 *      本地方法区:
 *      寄存区:给CPU使用
 *
 * 两个常见问题
 *  ArrayIndexOutOfBoundsException: 数组索引越界异常
 *      :访问不存在的索引
 *
 *  NullPointerException: 空指针异常
 *      :数组已经不再指向堆内存的数组了,再使用数组访问就会报错
 *
 *
 * 二维数组: 其实就是元素为一维数组的数组
 *  定义格式:
 *      1. 数据类型[] [] 数组名;(推荐方式)
 *      2. 数据类型 数组名[][]
 *      3. 数据类型 数组名[]
 *  初始化:
 *      1. 动态初始化
 *          数据类型[][] 数组名 = new 数据类型[m][n];
 *          m表示的是二维数组中一维数组的个数
 *          n表示的是一维数组中元素的个数
 *      2. 静态初始化
 *          数据类型[][] 数组名 = new 数据类型[][]{{元素1},{元素...},...}
 *         简化格式
 *          数据类型[][] 数组名 = {{元素1},{元素...},...}
 *
 */
public class ArrayDemo {
    public static void main(String[] args){

        // 动态初始化
//        int[] arr = new int[3];
//        System.out.println( arr[0] );
//        System.out.println( Arrays.toString(arr) );

        // 静态初始化
//        int [] arr = new int[]{1,2,3}; // 正常定义
//        int [] arr = {1,2,3}; // 简化版本
//        System.out.println( Arrays.toString(arr) );

        // 遍历数组
//        int [] arr = {1,2,3}; // 简化版本
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println( arr[i] );
//        }

        // 获取数组的最大值(最小)
//        int [] arr = {1,2,3,6,9,10,3}; // 简化版本
//        int max = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println( max );

        // 二维数组
        int [][] arr = {{1,2,3},{3,4,5}};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println( Arrays.toString(arr[i]) );
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                System.out.print( arr[i][x] + ",");
            }
            System.out.println();

        }


    }
}
