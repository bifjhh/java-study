package com.heima;

/**
 * 构造方法
 *
 * 格式:
 *      方法名和类名相同
 *      没有返回值类型, void都不能写
 *      没有具体返回值
 *
 * 构造方法的注意事项
 *  1. 如果我们没有给出构造方法,系统将默认给出一个无参构造方法以供使用
 *  2. 如果给出了构造方法,系统将不再提供默认的无参构造方法
 *      所以要自己写一个无参构造方法
 *  3. 构造方法也是可以重载的
 *
 */
public class Student {
    // 成员变量
    private String name;
    private int age;

    public Student(){}

    public Student(String name){}{
        this.name = name;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }else {
            System.out.println( "你输入的年龄不对" );
        }
    }

    // 成员方法
    public void study() {
        System.out.println( "好好学习" );
    }
    public void show() {
        System.out.println( "姓名是:"+name+",年龄是:"+age );
    }
}
