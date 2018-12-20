package com.heima_01;

import java.util.ArrayList;

/**
 * 包的特点
 *      可以有多层
 *      不同包下面的文件名可以重复
 *      包的声明,必须在第一行代码
 *
 * 不同包之间的互相访问
 *      使用类的全名
 *      使用关键字import将类导入
 *
 *
 * 注意: * 代表的是通配符, 嗲表的是这个包下面的类, 并没有导入子包下面类
 * 类的全名: 包名.类名
 *
 *
 *
 *
 *
 * 权限修饰符
 *      public
 *      default
 *      private
 *      protected
 *
 *
 */
public class PackageDemo {
    public static void main(String[] args) {
        PermissionsDemo pd = new PermissionsDemo();

        pd.publicMethod();
        pd.defaultMethod();
        pd.protectedMethod();
//        pd.privateMethod();


    }
}
