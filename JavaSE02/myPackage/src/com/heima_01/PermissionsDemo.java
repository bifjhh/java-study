package com.heima_01;

/**
 *
 * 权限修饰符
 *      public      当前类, 相同包下不同的类, 不同包下的类
 *      default     当前类, 相同包下不同的类
 *      private     当前类
 *      protected   当前类, 相同包下不同的类
 *
 *      default: 当前包下
 *      protected: 让子类对象可以使用
 *
 */
public class PermissionsDemo {
    private int name = 10;
    public void publicMethod(){
        System.out.println( "publicMethod" );
    }

    void defaultMethod(){
        System.out.println( "defaultMethod" );
    }

    private void privateMethod(){
        System.out.println( "private" );
    }

    protected void protectedMethod(){
        System.out.println( "protectedMethod" );
    }


    public static void main(String[] args){
    }
}
