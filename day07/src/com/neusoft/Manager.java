package com.neusoft;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/5/31 18:10
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    // 定义发红包方法
    public ArrayList<Integer> send(int totalMoney, int count){

        // 1、 看一下群主有多少钱, 余额不足要告诉一下


        // 2、 扣钱

        // 3、发红包将红包分成 count分

        // 如果除不开，将零头放到最后一个红包里

        // 4、将余额一个一个放到集合中


        return null;
    }
}
