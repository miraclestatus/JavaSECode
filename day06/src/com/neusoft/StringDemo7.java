package com.neusoft;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/5/17 17:08
 */
public class StringDemo7 {
    // 键盘录入一个字符串， 统计字符串中大小写字母及数字字符的个数

    // neusoft1Neuedu3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串数据");
        String s = scanner.nextLine();
        // 定义三个变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                System.out.println("该字符" + ch + "非法的");
            }

        }


        System.out.println("大写字符数量" + bigCount);
        System.out.println("小写字符数量" + smallCount);
        System.out.println("数字字符数量" + numberCount);
    }

}
