package com.heima;

import java.io.*;
import java.util.ArrayList;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        setObject();
//        getObject();
    }

    private static void getObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "b.txt" ) );
        Object obj = ois.readObject();
//        System.out.println( obj );
        ArrayList<Student> list = (ArrayList<Student>) obj;
        for (Student stu : list) {
            System.out.println( stu );
        }
        ois.close();
    }

    private static void setObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( "b.txt" ) );
        ArrayList<Student> list = new ArrayList<Student>(  );
        list.add( new Student( "小黑",19 ) );
        list.add( new Student( "小白",20 ) );

        oos.writeObject( list );
        oos.close();
    }
}
