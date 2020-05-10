package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/8 16:18
 */
public class TestStudent {
    public static void main(String[] args) {
        //无参构造使用
        Student s = new Student();
        s.setName("赵子龙");  s.setAge(18);
        System.out.println(s.getName()+"‐‐‐"+s.getAge());

        // 带参构造使用
        Student s2= new Student("关云长",18);
        System.out.println(s2.getName()+"‐‐‐"+s2.getAge());

    }
}
