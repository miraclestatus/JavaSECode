package com.neusoft;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/4/26 20:42
 */
public class Test03_StudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        studentInfo.setName("刘东东");
        System.out.println(studentInfo.getName());
        new ArrayList<>();
    }
}
