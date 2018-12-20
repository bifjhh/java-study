package com.heima;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
//        counteason();
//        palindromic(12321);
//        Fibonacci(20);
//        sum();
        grade();



    }

    /**
     * 键盘输入月份,计算对应的季节
     */
    public static void counteason() {
        Scanner sc = new Scanner( System.in );
        System.out.println( "请输入一个月份1-12" );
        int month = sc.nextInt();

/*        if(month<1||month>12){
            System.out.println( "您的输入的月份有误,请重新输入" );
            counteason();
        } else {
            if (month>2 && month <6) {
                System.out.println( "您的输入的月份为春季" );
            }else if(month>5 && month <9) {
                System.out.println( "您的输入的月份为夏季" );
            }else if(month>8 && month <12) {
                System.out.println( "您的输入的月份为秋季" );
            }else if(month>0 && month <3 || month==12) {
                System.out.println( "您的输入的月份为冬季" );
            }
        }*/

        // switch语法 case穿透写法
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println( "您的输入的月份为冬季" );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( "您的输入的月份为春季" );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( "您的输入的月份为夏季" );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( "您的输入的月份为秋季" );
                break;
            default:
                System.out.println( "您的输入的月份有误,请重新输入" );
                counteason();
        }
    }

    /**
     * 打印回文数
     */
    public static void palindromic(int num) {

        for (int i = 10000; i <=num ; i++) {
            int units = i%10;
            int tens = i/10%10;
            int thousand = i/1000%10;
            int million = i/10000%10;

            if(units==million && tens==thousand) {
                System.out.println( i );
            }
        }
    }

    /**
     * Fibonacci 不死神兔 斐波那契数列
     */
    public static void Fibonacci(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println( arr[arr.length-1] );
    }

    /**
     * 求出数组中满足要求的元素的和
     * int[] = {171,72,19,16,118,51,210,7,18}
     */
    public static void sum() {
        int[] arr = {171,72,19,16,118,51,210,7,18};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]%2==0 && arr[i]%10!=7 && arr[i]/10%10!=7) {
               sum += arr[i];
           }
        }
        System.out.println( sum );
    }

    /**
     * 评委打分  去掉最低分 去掉最高分 求和
     */
    public static void grade() {
        int[] arr = new int[6];
        Scanner sc = new Scanner( System.in );
        for (int i = 0; i < arr.length; i++) {
            System.out.println( "请"+ (i+1) +"位评委输入评分:" );
           arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = arr[0];
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum+=arr[x];
            if(arr[x]>max){
                max=arr[x];
            }

            if(min>arr[x]){
                min=arr[x];
            }

        }
        System.out.println( sum-max-min );
    }
}
