package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 18:43
 */
public class Student {
    // 学生id
    private int sid; //0
    private String name; // null
    private int age;
    // 类变量 记录学生数量, 分配学号
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }

    public void show(){
        System.out.println("stuent:name"+name+",age = "+age+"sid="+sid);
        showNum();
    }

    public static void showNum(){
        System.out.println("num "+ numberOfStudent);

    }




}
