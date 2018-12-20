package com.heima;

/**
 * 同步方法: 使用关键字修饰的方法,一旦被一个现成访问,则全部方法锁住.其他线程无法访问
 * synchronized
 * 注意:
 *      非静态同步方法的锁对象是 this
 *      静态的同步方法的锁对象是 当前类的字节码对象
 */
public class TicketThread implements Runnable {
    static int tickets = 100; // 总票数
    Object obj = new Object();
    @Override
    public void run() {
        // 售出火车票
        while (true) {
//            synchronized(obj){
////
////            }

//            method();
            method2();
        }
    }

//    private synchronized void method() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep( 100 );
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println( Thread.currentThread().getName() +  ":" + tickets--);
//        }
//    }
    private static synchronized void method2() {
        if (tickets > 0) {
            try {
                Thread.sleep( 100 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( Thread.currentThread().getName() +  ":" + tickets--);
        }
    }
}
