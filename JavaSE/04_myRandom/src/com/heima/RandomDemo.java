package com.heima;

import java.util.Random;
/**
 *
 * Random: 用于产生随机数
 *  1. 导包 import java.util.Random
 *  2. 创建对象 Random r = new Random
 *  3. 获取随机数 int num = r.nextInt(10) (取值区间0-9)
 */
public class RandomDemo {
    public static void main(String[] args) {

        Random r = new Random(  );

        int num = r.nextInt(10);
        System.out.println( num );
    }
}
