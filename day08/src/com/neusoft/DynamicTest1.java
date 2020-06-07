package com.neusoft;

import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/6/7 16:36
 */
public class DynamicTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(122);
        list.add(312);
        list.add(31312);
        list.add(4543);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int a = 100;
        // 变成 double 100.00
        double b = 99.9; // ---99
       //  格式： 父类类型 对象名 = new 子类对象
       //  格式： 子类类型 对象名 = （子类类型）new 父类对象


    }
}
