package com.duotai;

/**
 * 多态的前提:
 * 子父类的继承关系
 * 方法的重写
 * 父类引用指向子类对象
 * <p>
 * 动态绑定: 运行期间调用的方法,是根据其具体的类型(实例化的类型)
 * <p>
 * <p>
 * 多态的成员特点:
 * 成员变量: 编译时看的是左边的定义,运行是也是左边,因为变量在执行时没有重写的概念
 * 成员方法: 编译时看的是左边的定义,运行时是执行右边(new 的实例)
 * 静态方法: 编译时看的是左边的定义,运行时也是执行左边
 *
 * 多态的缺点:
 *  无法直接访问子类特有的成员
 *
 * 多态的优点
 *  可以提高可维护性 多态前提所保证的,提高代码的可扩展性
 *
 */
public class PoymorphicDemo {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.eat();
        // 父类引用 Animal a
        // 指向 =
        // 子类对象 new Cat();

//        Animal a = new Cat();
//        System.out.println( a.num ); // 成员变量
//        a.eat();    // 成员方法
//        a.fn();
        MiFactory factory = new MiFactory();
        factory.createPhone( new MiNote() );
        factory.createPhone( new RedMi() );


    }
}

class Animal {
    int num = 30;

    public void eat() {
        System.out.println( "吃东西" );
    }

    public static void fn(){
        System.out.println( "父类静态方法" );
    }
}

class Cat extends Animal {
    int num = 20;

    public void eat() {
        System.out.println( "吃鱼" );
    }

    public static void fn(){
        System.out.println( "静态方法" );
    }
}

class MiFactory {
//    public void createPhone(MiNote mi) {
//        mi.call();
//    }
//    public void createPhone(RedMi mi) {
//        mi.call();
//    }
    public void createPhone(Phone p) {
        p.call();
    }
}

interface Phone{
    public void call();
}

class MiNote implements Phone{
    public void call() {
        System.out.println( "note" );
    }
}class RedMi implements Phone{
    public void call() {
        System.out.println( "红米" );
    }
}