package com.heima;

/**
 * 继承: 多各类有共同的成员变量和成员方法,抽取到另外一个类中(父类)
 * extends: 继承关键字
 */

public class ExtendsDemo {
    public static void main(String[] args) {
        DotA d = new DotA();
        d.start();
    }
}

class Game {
    String name;
    double version;
    String agent;

    public void start() {
        System.out.println( "启动" );
    }

    public void stop() {
        System.out.println( "关闭" );
    }
}

class DotA extends Game {

}
class LOL extends Game {}
