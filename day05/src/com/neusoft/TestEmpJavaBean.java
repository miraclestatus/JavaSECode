package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/10 15:21
 */
public class TestEmpJavaBean {
    public static void main(String[] args) {
        EmpJavaBean emp = new EmpJavaBean("王青松", 3306, "Java工程师", 23999);
        System.out.println("姓名:"+ emp.getEmpName()+"薪资："+emp.getSalary());
    }
}
