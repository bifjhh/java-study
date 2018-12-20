package com.heima;

/**
 * Java语言的继承是单一继承,一个子类只能有一个父类
 * Java语言给我们提供了一种机制,用于处理继承单一的局限性的  接口
 *
 * 接口:
 *  接口是一个比抽象类还抽象的类,
 *  接口里所有的方法都是抽象方法,
 *  接口和类的关系是实现  implements interface
 *
 *  格式:
 *      interface 接口名 {
 *
 *      }
 *
 * 接口的成员特点:
 *      只能有抽象方法 默认都是抽象方法
 *      默认有 public & abstract 修饰方法
 *      只能使用 public & abstract 修饰方法
 *      默认使用 public static final 来修饰成员变量
 *
 * 注意:
 *      接口不能创建对象(不能通过new 来实例化)
 *      类与接口的关系是实现关系,一个类要实现一个接口必须实现它的所有方法
 *
 *
 * -----------------------------------
 * 类与类: 继承关系,单一继承,多层继承
 * 类与接口: 实现关系
 * 接口与接口的关系: 继承关系,多继承
 *
 *
 * --接口的有点--
 * 1. 类与接口的关系--实现关系,而且是多实现,一个类可以实现多个接口
 *      类与类之间是继承关系,Java中的继承是单一继承,一个类只能有一个父类,接口打破了继承的局限性(接口有多个父接口)
 * 2. 对外提供规则
 * 3. 降低了程序的耦合性
 *      可以实现模块化开发,定义好规则,每个人实现自己的模块,提高了开发的效率
 *
 *
 * -- 接口和抽象类的区别 --
 * 共性: 不断的抽取,抽取出抽象的概念
 * 区别:
 *  1. 与类的关系
 *      1. 类与接口是实现关系,而且是多实现,一个类可以实现多个接口
 *      2. 类与抽象类是继承关系,Java中的继承是单一继承,一个类只能有一个父类,Java中的继承是多层继承
 *  2. 成员变量:
 *      抽象类可以有成员变量,也可以有常量
 *      接口只能有常量
 *  3. 成员方法:
 *      抽象类可以有抽象方法,也可以由非抽象方法
 *      接口只能有抽象方法,而且方法有默认的修饰符
 *  4. 构造方法
 *      抽象类有构造方法
 *      接口没有构造方法
 *
 *
 */
public class InterfaceDemo {
    public static void mai(String[] args) {

    }
}

interface Animal {
    public static final int num = 10;
    public abstract void eat();
}

class Cat implements Animal {

    @Override
    public void eat() {

    }
}


/*-----------接口与接口的关系-----------*/



interface InterA extends InterB {
    public static final int num = 10;
    public abstract void eat();
}

interface InterB {
    public static final int num = 20;
    public abstract void function();
}


interface InterC extends InterA {
    public static final int num = 20;
    public abstract void eat();
}



class Demo implements InterC {

    @Override
    public void eat() {

    }

    @Override
    public void function() {

    }
}
