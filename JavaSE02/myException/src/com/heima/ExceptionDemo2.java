package com.heima;

/**
 * 自定义异常:
 *  指定规则,如果不满足则抛出异常
 *  throws: 处理异常的一种方式
 *  throw: 制造异常的方式
 *  自定义一个异常类,继承Exception或者RuntimeException,然后实现多个构造
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
       try {
           throw  new RuntimeException("测试输出异常原因");
       } catch (RuntimeException error) {
           error.printStackTrace();
       }
    }
}
