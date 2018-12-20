package com.heima;

/**
 *
 * 顺序结构: 从上往下,依次执行
 *
 * 选择结构,也被称为分支结构
 *  1. if语句
 *  2. switch语句
 *
 * 循环结构
 *  1. for
 *  2. while
 *  3. do...while
 *
 *  跳转控制
 *      break:用于结束循环
 *          1.switch 中使用
 *          2. 循环中使用
 *
 *      continue:跳过本次循环
 *
 */
public class OrderDemo {
    public static void main(String[] args) {

//        System.out.println( "顺序结构: 从上往下,依次执行" );
//        System.out.println( 1 );
//        System.out.println( 2 );
//        System.out.println( 3 );
//        System.out.println( 4 );

//        System.out.println( "选择结构,也被称为分支结构" );

        // if 语句
//        if (1>2) {
//            System.out.println( "1>2" );
//        } else {
//            System.out.println( "1不大于2" );
//        }

//        if (1>2) {
//            System.out.println( "1>2" );
//        } else if(1==2) {
//            System.out.println( "1==2" );
//        } else {
//            System.out.println( "1不大于2,也不等于2" );
//
//        }

//        switch语句
//        int a = 2;
//        switch (a) {
//            case 1:
//                System.out.println( "a==1" );
//                break;
//            case 2:
//                System.out.println( "a==2" );
//                break;
//            default:
//                System.out.println( "什么都不是" );
//        }


        // 循环语句
//        求1-5的正序循环输出
//        for (int i = 0; i < 5; i++) {
//            System.out.println( i+1 );
//        }
//        求1-5的正序循环输出
//        for (int i = 5; i >0 ; i--) {
//            System.out.println( i );
//        }

//        求1-5的和
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum = sum + i;
//        }
//        System.out.println( sum );

//        求1-100之间偶数和
//        int sum = 0;
//        for (int i = 1; i < 100; i++) {
//            if(i%2==0){
//                sum+=i;
//            }
//        }
//        System.out.println( sum );

//        输出水仙花数 个位的立方+十位数的立方+百位数的立方 == 这个数字本身
//        int num = 153;
//        System.out.println( (153/100)%10 );
//        System.out.println( (153/10)%10 );
//        System.out.println( 153%10 );

//        for (int i = 100; i < 1000; i++) {
//            int units = i%10;
//            int tens = (i/10)%10;
//            int hundreds = (i/100)%10;
//            int sum = units*units*units + tens*tens*tens + hundreds*hundreds*hundreds;
//
//            if( sum == i) {
//                System.out.println( i );
//            }
//        }

        // 输出水仙花数字的个数
//        int num = 0;
//        for (int i = 100; i < 1000; i++) {
//            int units = i%10;
//            int tens = (i/10)%10;
//            int hundreds = (i/100)%10;
//            int sum = units*units*units + tens*tens*tens + hundreds*hundreds*hundreds;
//
//            if( sum == i) {
//                num++;
//            }
//        }
//        System.out.println( num );


        // while 循环语句
//        int num = 0;

//        while (num<5){
//            num++;
//            System.out.println( num );
//        }

//        do {
//            num++;
//            System.out.println( num );
//        }while (num<5);

        // 跳转控制
//        for (int i = 1; i < 10; i++) {
//            if (i==3){
//                break;
//            }
//            System.out.println( i );
//        }

        for (int i = 1; i < 10; i++) {
            if (i==3){
                continue;
            }
            System.out.println( i );
        }


    }
}

