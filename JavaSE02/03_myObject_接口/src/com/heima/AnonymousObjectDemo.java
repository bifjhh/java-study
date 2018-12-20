package com.heima;

/**
 * 匿名对象: 没有名字的对象
 * 应用场景:
 *  当方法只用调用一次的时候
 *  可以当做参数进行传递,但是无法在传参之前做其他的事情
 *
 * 注意:
 *  匿名对象可以引用并赋值,但是毫无意义
 *
 *
 */
public class AnonymousObjectDemo {
    public static void main(String[] args) {
//        Studen s = new Studen();
//        s.study();
//        new Studen(); // 匿名对象, 没有变量引用的对象
        new Studen().study();//
    }
}


class Studen {
   String name;
   int age;

    public void study () {
        System.out.println( "好好学习" );
    }
}