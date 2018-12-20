package com.heima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 由于集合可以存储任意类型的对象,当我们存储了不同类型的对象,就有可能在转换类型是出现异常,
 * 所以java为了解决这个问题,给我们提供了一种机制  泛型
 *
 * 泛型: 是一种广泛的类型,把明确数据类型的工作提前到了编译时期,借鉴了数组的特点
 * 好处:
 *      避免了类型转换的问题
 *      简化代码书写
 *
 *
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList(  );
        Student s = new Student( "小明", 20 );
        Student s2 = new Student( "小黑", 18 );

        c.add(s);
        c.add(s2);

        Iterator<Student> it = c.iterator();

        while (it.hasNext()) {
//            String str = (String)it.next();
//            System.out.println( str );
            Student stu = it.next();
            System.out.println( stu.getName() + "\t" + stu.getAge() );
        }

    }
}
