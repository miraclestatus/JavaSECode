package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/10 14:57
 */
public class EmpJavaBean {
    // 员工姓名
    private  String empName;
    // 工号
    private  int empNo;
    // 职位
    private String job;
    // 薪资
    private  double salary;

    public EmpJavaBean() {
    }

    public EmpJavaBean(String empName, int empNo, String job, double salary) {
        this.empName = empName;
        this.empNo = empNo;
        this.job = job;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
