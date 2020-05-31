package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/31 14:29
 */
public class ExtendDemoTest1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        // 属性赋值
        teacher.name = "小明";
        //调用 printName方法
        teacher.printName();
        // 调用父类的方法
        teacher.work();
    }
}
