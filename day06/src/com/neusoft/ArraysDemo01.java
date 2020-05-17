package com.neusoft;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/5/17 20:03
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        // toString() 返回此对象本身（它已经是一个字符串！）。
        // 返回对象的字符串表示形式
        int[] arr = {3, 7, 4, 1, 18, 5};
        System.out.println(arr);
        System.out.println("排序前" + Arrays.toString(arr));
        // static void sort(int[] a) 对指定的 int 型数组按数字升序进行排序。
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));

        String line = "DSAmsadsaopMIPLOK";// 字符升序排序，并且倒序打印

        char[] chars = line.toCharArray();

//        排序
        Arrays.sort(chars);
        System.out.println("line升序排序后"+Arrays.toString(chars));

        // 反向遍历输出
        for (int i = chars.length-1; i >=0 ; i-- ) {
            System.out.print(chars[i]+" ");

        }
        System.out.println("++++++++++++++++++++++++++");

        // copyOf(boolean[] original, int newLength)
        ///复制指定的数组，截取或用 false 填充（如有必要），以使副本具有指定的长度。
        // 返回一个新的数组。不影响原来的数组
        int[] ints = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = Arrays.copyOf(arr,4);
        System.out.println(Arrays.toString(ints1));
    }
}
