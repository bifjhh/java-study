package com.heima;

/**
 * String 类 是属于java.lang下面的类包,所以不需要导包
 *      字符串类, 是有多个字符组成的
 *
 * 字符串是一种比较特殊的引用数据类型,直接输出字符串对象输出的是该对象的数据
 *
 * 通过构造方法创建字符串对象是在堆内存
 * 直接复制方法是在方法区的常量池里面
 *
 *
 * String类的判断功能
 *
 * String类的获取功能
 *      length() 获取字符串的长度
 *      charAt() 获取指定索引处的字符
 *      indexOf() 获取某个字符在字符串中第一次出现的索引
 *      substring() 截取字符串
 *  判断字符串中大小写以及数字字符的数量
 *      str>="A" && str<="Z"    判断是否大写
 *      str>="a" && str<="z"    判断是否小写
 *      str>="0" && str<="9"    判断是否数字
 *
 */

/**
 * String : 字符串类
 * 由多个字符组成的数据
 * 字符串其本质是一个字符数组
 * <p>
 * 构造方法:
 * String(String original): 把字符串数据封装成字符串对象
 * <p>
 * 判断方法
 * equals(Object anObject)  将此字符串与指定的对象比较。
 * equalsIgnoreCase(String anotherString)  比较，不考虑大小写
 * <p>
 * String类的获取功能方法
 * int length() 获取字符串的长度,字符串的个数
 * char charAt(int index) 获取制定索引处的字符
 * int indexOf(Sting str) 获取str 在字符串对象中第一次出现的索引
 * String substring(int start) 从start 开始截取字符串
 * String substring(int start, int end) 从start 开始截取字符串到end结束
 *
 * String 类的转换功能
 * char[] toCharArray() 把字符串转换为字符串数组
 * String toLowerCase() 把字符串转换为小写字符串
 * String toUpperCase() 把字符串转换为大写字符串
 * String trim() 去除字符串两端的空格
 * String[] split(String str) 按照指定符号分割字 符串
 */
public class StringDemo {
    public static void main(String[] args){

        // 把字符串数据封装成字符串对象
//        String s1 = new String( "hello" );
//        System.out.println( s1 );

        // 把字符串数组封装成字符串对象
//        char[] chs = {'b','i','f','j','h','h'};
//        String s2 = new String( chs );
//        System.out.println( s2 );

        // 把字符数组中的一部分数据封装成字符串对象

//        String s3 = new String( chs, 0, chs.length );
//        String s4 = new String( chs, 2, 2 );
//        System.out.println( s3 );
//        System.out.println( s4 );

        // String类的判断功能
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        // 比较字符串的内容是否相同
        System.out.println( s1.equals( s2 ) );
        System.out.println( s1.equals( s3 ) );

        // 比较字符串的内容是否相同--忽略大小写
        System.out.println( s1.equalsIgnoreCase( s2 ) );
        System.out.println( s1.equalsIgnoreCase( s3 ) );

        // 判断字符串对象是否以指定字符串开开头
        System.out.println( s1.startsWith( "he" ) );




    }
}
