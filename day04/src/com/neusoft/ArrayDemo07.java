package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/26 16:53
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2;
        System.out.println(a); // 1
        System.out.println(b); // 2
        System.out.println("----------------------");
        change(a, b);
        System.out.println(a); // a = 1
        System.out.println(b); //  b = 2
        System.out.println("-----------------------------------");
        int[] arr = {1, 3, 5};
        System.out.println(arr[0]); // 1
        change2(arr);
        System.out.println(arr[0]); // 200
    }
    public static void change(int a, int b){
        a = a + b;
        int c = 6;
        b = b + a;
    }

    public static void change2(int[] arr){
        arr[0] = 200;
    }

}
