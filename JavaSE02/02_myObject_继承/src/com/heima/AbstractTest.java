package com.heima;

/**
 *
 *  共性:
 *      属性:  姓名,年龄,性别
 *      行为:  讲课,唱歌
 *
 *  非共性: 可以在单独的类中定义
 *
 *
 */
public class AbstractTest {
    public static void main(String[] args) {
        BasicTeacher bt = new BasicTeacher();
        bt.name = "基础";
        bt.teach();

        JobTeacher jt = new JobTeacher();
        jt.name = "就业";
        jt.level = "leader";
        jt.teach();
        jt.Test();

    }
}

abstract class Teacher {
    String name;
    int age;
    String gender;

   abstract public void teach();
}

class BasicTeacher extends Teacher {

    @Override
    public void teach(){
        System.out.println( name + "基础课程" );
    }
}


class JobTeacher extends Teacher {
    String level;

    @Override
    public void teach(){
        System.out.println( name + "就业课程" );
    }

    public void Test(){
        System.out.println( name + level + "带你一起练习" );
    }
}