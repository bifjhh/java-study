package com.heima;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFile {

    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();
        getStudentList( array );
        while (true) {
            System.out.println( "------欢迎来到学生管理系统,请选择:------" );
            System.out.println( "1 查看所有的学生" );
            System.out.println( "2 添加学生" );
            System.out.println( "3 删除学生" );
            System.out.println( "4 修改学生" );
            System.out.println( "5 退出" );
            System.out.println( "请输入你的选择" );
            // 获取用户输入
            Scanner sc = new Scanner( System.in );
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    findStudent( array );
                    break;
                case "2":
                    addStudent( array );
                    setStudentFile( array );
                    break;
                case "3":
                    delStudent( array );
                    setStudentFile( array );
                    break;
                case "4":
                    editStudent( array );
                    setStudentFile( array );
                    break;
                case "5":
                default:
                    System.out.println( "欢迎再次使用" );
                    System.exit( 0 );
                    break;
            }
        }
    }

    public static void getStudentList(ArrayList<Student> array) throws IOException {
        // 创建输出缓冲流对象
        BufferedReader br = new BufferedReader( new FileReader( "/Users/sunkun/Desktop/Code/Java/JavaSE/11_myApiToFile/arrayList.txt" ) );

        String line;

        while ((line = br.readLine()) != null) {
            String[] strArray = line.split( "," );
            Student s = new Student();
            s.setId( strArray[0] );
            s.setName( strArray[1] );
            s.setAge( strArray[2] );
            s.setAddress( strArray[3] );
            array.add( s );
        }
        br.close();
    }

    public static void setStudentFile(ArrayList<Student> array) throws IOException {

        BufferedWriter bw = new BufferedWriter( new FileWriter( "/Users/sunkun/Desktop/Code/Java/JavaSE/11_myApiToFile/arrayList.txt" ) );

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get( i );

            StringBuilder sb = new StringBuilder();
            sb.append( s.getId() ).append( "," ).append( s.getName() ).append( "," ).append( s.getAge() ).append( "," ).append( s.getAddress() );

            bw.write( sb.toString() );
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    private static void findStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println( "暂无学生信息,请重新选择" );
            return;
        }
        System.out.println( "id\t姓名\t年龄\t居住地" );
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get( i );
            System.out.println( s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress() );
        }
    }

    private static String isId(ArrayList<Student> array, String id) {
        boolean isIndex = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get( i ).getId().equals( id )) {
                isIndex = true;
                break;
            }
        }
        if (isIndex) {
            Scanner sc = new Scanner( System.in );
            System.out.println( "您输入的id重复,请重新输入" );
            id = isId( array, sc.nextLine() );
        }
        return id;
    }

    private static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "请输入需要修改的id编号" );
//        String id = sc.nextLine();
        String id = isId( array, sc.nextLine() );

        System.out.println( "请输入姓名" );
        String name = sc.nextLine();
        System.out.println( "请输入年龄" );
        String age = sc.nextLine();
        System.out.println( "请输入地址" );
        String address = sc.nextLine();

        Student stu = new Student();
        stu.setId( id );
        stu.setName( name );
        stu.setAge( age );
        stu.setAddress( address );

        array.add( stu );

        System.out.println( "添加完成" );
    }

    private static void delStudent(ArrayList<Student> array) {
        if (array.size() > 0) {
            System.out.println( "请输入id" );
            Scanner sc = new Scanner( System.in );
            String id = sc.nextLine();
            boolean isIndex = true;
            for (int i = 0; i < array.size(); i++) {
                if (array.get( i ).getId().equals( id )) {
                    isIndex = false;
                    array.remove( i );
                    System.out.println( "删除完成" );
                    break;
                }
            }
            if (isIndex) {
                System.out.println( "没有找到对应id" );
            }
        }
    }

    private static void editStudent(ArrayList<Student> array) {
        if (array.size() > 0) {
            System.out.println( "请输入id" );
            Scanner sc = new Scanner( System.in );
            String id = sc.nextLine();
            int index = -1;
            for (int i = 0; i < array.size(); i++) {
                if (array.get( i ).getId().equals( id )) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println( "没有找到对应id" );
            } else {
                Student stu = new Student();
                System.out.println( "请输入id" );
                String num = sc.nextLine();
                System.out.println( "请输入姓名" );
                String name = sc.nextLine();
                System.out.println( "请输入年龄" );
                String age = sc.nextLine();
                System.out.println( "请输入地址" );
                String addres = sc.nextLine();
                stu.setId( num );
                stu.setName( name );
                stu.setAge( age );
                stu.setAddress( addres );
                array.set( index, stu );
                System.out.println( "修改完成" );
            }
        }
    }
}
