package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 18:51
 */
public class TestStudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 8);
        Student s3 = new Student("王五", 28);
        Student s4 = new Student("赵六", 8);
        Student s5 = new Student("赵六", 8);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        Student.showNum();
    }
}
