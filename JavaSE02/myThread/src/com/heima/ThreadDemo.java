package com.heima;

/**
 * 多线程
 * <p>
 * 进程: 当前正在运行的程序,一个应用程序在内存中的执行区域
 * 线程: 进程中的一个执行控制单元, 执行路径
 * 一个进程可以有一个线程,也可以由多个线程
 * <p>
 * 单线程: 安全性高,但是效率低
 * 多线程: 安全性低,效率高
 * <p>
 * 创建新执行线程有两种方法。一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。接下来可以分配并启动该子类的实例
 * static Thread	currentThread()   返回对当前正在执行的线程对象的引用。
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线程实例
        MyThread2 mt = new MyThread2();
        Thread t = new Thread( mt );
        t.setName( "线程1" );
        // 启动线程
        t.start();

        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread( mt2 );
        t2.setName( "线程2" );
        t2.start();

    }


}
