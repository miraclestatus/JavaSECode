package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 18:03
 */
public class ForForDemo06 {
    // 打印矩形 3 x 5
    // 外层负责换行， 里层负责打印每一行的内容
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
