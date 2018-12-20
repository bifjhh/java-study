package com.heima;

/**
 * Java中继承的特点
 *      只能继承一个父类
 *      可以多层继承
 *      子类只能获取父类的非私有成员
 *
 * 变量使用的就进原则:
 *      如果子类和父类有相同的变量,则遵循就进原则
 *      super:使用父类的成员(变量或方法)
 *      this: 使用类本身的变量
 *
 * 方法的重写: 当父类方法不能完全满足子类使用的时候,
 *      重写后也可以通过super关键字来调用父类的方法
 *      不能重写父类私有的方法
 *      权限必须大于等于父类方法的全新啊
 *
 * 注解: @
 *
 * 继承中构造方法的执行顺序
 *
 * 继承的优点
 *      提高了代码的复用性
 *      方便了维护
 * 继承的缺点
 *      类的耦合性增强了
 *      开发的原则: 高内聚低耦合
 *      内聚: 自己完成某件事情的能力
 *      耦合: 类与类的关系
 *
 */

public class ExtendsDemo02 {
    public static void main(String[] args) {
        DotA d = new DotA();
        d.start();
    }
}


class Game1 {
    String name;
    double version;
    String agent;


    public void start() {
        System.out.println( "启动Game1" );
    }

    public void stop() {
        System.out.println( "关闭Game1" );
    }
}

class PcGame extends Game1 {
    String name;
    double version;
    String agent;

    public void start() {
        System.out.println( "启动PcGame" );
    }

    public void stop() {
        System.out.println( "关闭PcGame" );
    }
}

class MobilGame {
    String name;
    double version;
    String agent;

    public void start() {
        System.out.println( "启动MobilGame" );
    }

    public void stop() {
        System.out.println( "关闭MobilGame" );
    }
}

class Lol extends PcGame {}
//class Lol extends PcGame MobilGame {}
