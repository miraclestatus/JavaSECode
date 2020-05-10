package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/10 18:33
 */
public class Test01StudentArray {
//    创建一个学生数组,存储刘、关、张、赵 四位同学的信息
public static void main(String[] args) {
    // 创建一个StudentJavaBean类的数组对象， 名字叫students
    StudentJavaBean[] students = new StudentJavaBean[4];
    // 创建四个StudentJavaBeant类实例，分别初始化刘、关、张、赵 四位同学的信息
    StudentJavaBean s1 = new StudentJavaBean("刘玄德", 50);
    StudentJavaBean s2 = new StudentJavaBean("关云长", 45);
    StudentJavaBean s3 = new StudentJavaBean("张翼德", 42);
    StudentJavaBean s4 = new StudentJavaBean("赵子龙", 41);
    // 把这四个实例 赋值给 students
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;
    // 遍历输出这四个同学的名字个年龄
    for (int i = 0; i <students.length ; i++) {
        StudentJavaBean s = students[i];
        System.out.println(s.getName()+"+++"+s.getAge());
    }
}
}
