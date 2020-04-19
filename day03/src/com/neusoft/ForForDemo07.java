package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 18:03
 * 打印三角形
 */
/*
 *
 **
 ***
 ****
 ******/
public class ForForDemo07 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//}
//    }
public static void main(String[] args) {
    for (int i = 1; i <=5 ; i++) {
        for (int j = i; j <=5 ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
