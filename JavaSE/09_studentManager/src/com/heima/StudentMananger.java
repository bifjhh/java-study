package com.heima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMananger {

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("-----欢迎来到学生管理系统,请选择:------");
            System.out.println("1 查看所有的学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    findAll(array);
                    break;
                case "2":
                    addStudent(array);
                    break;
                case "3":
                    delStudent(array);
                    break;
                case "4":
                    editStudent(array);
                    break;
                case "5":
                default:
                    System.out.println("-----");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void findAll (ArrayList<Student> array) {
        if (array.size()<=0){
            System.out.println("暂无学生信息,请重新选择");
            return;
        }
        for (int i = 0; i <array.size() ; i++) {
            Student s = array.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }

    }

    private static String isId(ArrayList<Student> array, String id){
        boolean isIndex = false;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getId().equals(id)){
                isIndex = true;
                break;
            }
        }
        if(isIndex){
            Scanner sc = new Scanner(System.in);
            System.out.println("您输入的id重复,请重新输入");
            id = isId(array,sc.nextLine());
        }
        return id;
    }

    public static void addStudent (ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id:");
        String id = isId(array,sc.nextLine());

        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        System.out.println("请输入地址:");
        String address = sc.nextLine();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);
        array.add(stu);
        System.out.println("添加完成");
    }

    public static void delStudent (ArrayList<Student> array) {
        if (array.size()<=0){
            System.out.println("暂无学生信息,请重新选择");
            return;
        }
        System.out.println("请输入id");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        boolean isIndex = true;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getId().equals(id)){
                isIndex = false;
                array.remove(i);
                System.out.println("删除完成");
                break;
            }
        }
        if(isIndex){
            System.out.println("没有找到对应id");
        }
    }

    public static void editStudent (ArrayList<Student> array) {}
}
