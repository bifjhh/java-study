package com.heima_02;

import com.heima_01.PermissionsDemo;

public class PackageDemo extends PermissionsDemo {
    public void function() {
        super.protectedMethod();
    }

    public static void main(String[] args){
        PermissionsDemo pd = new PermissionsDemo();

        pd.publicMethod();
//        pd.defaultMethod();
//        pd.protectedMethod();
//        pd.privateMethod();

        PackageDemo pd2 = new PackageDemo();
        pd2.function();
    }
}
