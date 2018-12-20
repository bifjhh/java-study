package com.heima;

/**
 * abstract: 关键字,用于修饰方法和类
 * 抽象方法: 不同类的方法时相似的,但是具体内容又不太用于,所以我们只能抽取他的声明,没有具体的方法体就是抽象方法
 * 抽象类: 有抽象方法的类必须是抽象类
 *
 * 注意: 一个类继承了抽象类,则需要继承他所有的抽象方法,除非这个类也是抽象类
 *      非抽象方法不需要重写
 *
 * 抽象类的特点
 *      抽象方法只能在抽象类里面
 *      抽象类和抽象方法必须被abstract修饰
 *      抽象类不能创建对象(不能new 来实例化)
 *      抽象类中可以有非抽象方法
 *      抽象类和类的关系也是继承
 *      一个类继承了抽象类,要么重写所有的抽象方法,要么自己变成抽象类
 *
 * 抽象类的成员特点
 *      成员变量
 *          可以有成员变量,也可以有成员方法
 *      成员方法
 *          可以有抽象方法,也可以有非抽象方法
 *      构造方法
 *          可以有构造方法,需要对抽象类的成员变量进行初始化
 *
 *
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog() {
            @Override
            public void eat() {
                System.out.println( "狗吃骨头" );
            }
        };
        c.eat();
        d.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}
 class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println( "猫吃鱼" );
    }
    //    public void eat() {
//        System.out.println( "猫吃鱼" );
//    }

}
abstract class Dog extends Animal{
//    public void eat() {
//        System.out.println( "狗吃骨头" );
//    }
}
