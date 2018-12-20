package com.heima;

/**
 * 篮球运动员和教练
 * 足球运动员和教练
 * 篮球运动员和教练需要出国,学习英语
 * 请根据所学的知识,分析应该使用普通类,抽象类,还是接口
 *
 * 人       最上层类
 * 运动员和教练   抽象类
 * 不同的运动员和类  基础类
 * 学英语--接口
 *
 *
 *
 */
public class InterfaceTest {
    public static void main(String[] args){
        // 创建篮球运动员
        BasketCoach bc = new BasketCoach();
        bc.name = "小明";
        bc.age = 22;
        bc.gender = "男";
        bc.teach();

        BasketPlayer bp = new BasketPlayer();
        bp.name = "小明";
        bp.age = 22;
        bp.gender = "男";
        bp.study();
        bp.speak();
    }
}

// 人
class Person {
    String name;
    int age;
    String gender;

    public Person() {};

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println( "吃饭" );
    }

    public void sleep() {
        System.out.println( "睡觉" );
    }
}

// 学习英语
interface SpeakEnglish {
    public abstract  void speak();
}

// 运动员
abstract class Player extends Person {
    public abstract void study();
}

// 教练
abstract class Coach extends Person {
    public abstract void teach();
}

//篮球运动员
 class  BasketPlayer extends Player implements SpeakEnglish {

    @Override
    public void study() {
        System.out.println( "学习篮球" );
    }

    @Override
    public void speak() {
        System.out.println( "学英语" );
    }
}

// 篮球教练
class BasketCoach extends Coach implements SpeakEnglish {
    @Override
    public void teach() {
        System.out.println( "教学篮球" );
    }

    @Override
    public void speak() {
        System.out.println( "学英语" );
    }
}

