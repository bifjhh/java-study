package com.heima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 把学生信息读取后存到集合,然后遍历集合在控制台输出
 */
public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();

        BufferedReader br = new BufferedReader( new FileReader( "arrayList.txt" ) );

        String line;

//        while ((line=br.readLine())!=null){
//            String[] strArray = line.split( "," );
//            Student s = new Student(  );
//            s.setId( strArray[0] );
//            s.setName( strArray[1] );
//            s.setAge( strArray[2] );
//            s.setAddress( strArray[3] );
//            array.add( s );
//        }
        br.close();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get( i );
            System.out.println( s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());

        }

    }
}
