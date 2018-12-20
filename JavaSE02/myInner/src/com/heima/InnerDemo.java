package com.heima;

/**
 * 成员内部类
 *      在成员的内部,和成员变量和成员方法的位置是相同的
 *      在内部类重,可以直接访问外部类的成员,包括私有成员
 *
 * 成员内部类的修饰符
 *      可以使用权限修饰符修饰成员内部类,但是如果使用私有修饰符,则无法在其他类中访问
 *      可以使用static修饰成员内部类,不需要再创建外部类对象
 *      也可以使用abstract,final来修饰成员内部类,但毫无意义
 *
 * 局部内部类
 *      类似于局部变量一样,所在位置在方法内部,出了方法则无法使用
 *
 * 匿名内部类
 *      可以把匿名内部类看成是一个没有名字的局部内部类
 *      定义在方法内部
 *      必须在定义匿名内部类的时候创建他的对象
 * 格式:
 *      new 类/接口(){
 *          如果创建了继承这个类的子对象,可以重写父类的方法
 *          如果是创建了实现这个接口的子类对象,必须要实现该接口的所有方法
 *      }
 *
 *
 */
public class InnerDemo {
    public static void main(String[] args){
//    Outer o = new Outer();
//    o.menthod();
//        Outer.Inner i = new Outer().new Inner();
//        i.fn();
//        Outer.Inner i2 = new Outer.Inner();
//        i2.fn();

        Outer o = new Outer();
        o.menthod();

    }
}

class Outer {
    private int num = 10;

    public void menthod(){
//        Inner i = new Inner();
//        i.fn();
       /* new Inner() {

            @Override
            public void fn() {
                System.out.println( "匿名对象" );
            }
        }.fn();*/

        Inner i = new Inner() {

            @Override
            public void fn() {
                System.out.println( "匿名对象" );
            }
        };
        i.fn();

    }

//    static class Inner {
//        public void fn(){
//            System.out.println( "function");
//        }
//    }
}

interface Inner {
    public void fn();
}