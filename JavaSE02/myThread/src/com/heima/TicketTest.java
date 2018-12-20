package com.heima;

/**
 * 模拟火车售票
 *  分析: 首先需要总数,然后售出一张则数量-1
 *       当数量<1时,停止售票
 *       使用多线程来模拟多个售票窗口进行售票
 *
 *  static void	sleep(long millis)
 *  在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 */
public class TicketTest {
    public static void main(String[] args) {
        TicketThread tt = new TicketThread();
        Thread t1 = new Thread( tt );
        t1.setName( "001" );
        Thread t2 = new Thread( tt );
        t2.setName( "002" );
        Thread t3 = new Thread( tt );
        t3.setName( "003" );

        t1.start();
        t2.start();
        t3.start();


    }
}
