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
        ArrayList<Integer> redList = new ArrayList<>();

        // 1、 看一下群主有多少钱, 余额不足要告诉一下
        int leftmoney = super.getMoney();
        if (leftmoney < totalMoney){
            System.out.println("余额不足");
            return redList;
        }
        // 2、 扣钱
        super.setMoney(leftmoney-totalMoney);

        // 3、发红包将红包分成 count分
        int avg = totalMoney / count;
        int mod = totalMoney % count;// 余数，也就是零头部分
        
        
        // 如果除不开，将零头放到最后一个红包里

        // 4、将余额一个一个放到集合中，
        // 放 前count-1
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        // 放第count个
        int last = avg +mod;
        redList.add(last);


        return redList;
    }
}
