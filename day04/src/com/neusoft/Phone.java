package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/26 19:14
 */
public class Phone {
    // 品牌
    String brand;
    // 价格
    int price;
    // 颜色
    String color;   // 成员变量

    // 方法
    // 给 name 打电话
    public void call(String name){
        int a = 45; // 局部变量
        System.out.println("给"+name+"打电话");
    }

    // 发短信
    public void sendMessage(){
        System.out.println("");
    }



}
