package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 19:28
 *  9 x 9 乘法表
 * */
public class ForForDemo08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
