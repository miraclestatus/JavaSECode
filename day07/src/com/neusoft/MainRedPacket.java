package com.neusoft;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/5/31 18:24
 */
public class MainRedPacket {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("当前显示群里所有人的余额");
        // 一个群主100， 3个人成员0,0,0
        Manager manager = new Manager("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("================");
        System.out.println("请群主输入要发红包的金额"); // 20, 8/6/6
        int money = new Scanner(System.in).nextInt();
        // 发红包
        ArrayList<Integer> redList = manager.send(money, 3);

        // 收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);


        // 显示所有人当前的余额
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
