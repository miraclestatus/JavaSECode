package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/26 16:21
 * 数组作为方法的返回值
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static  int[] getArray(){
        int[] arr = {1, 2, 3, 4, 5};
        // 返回数组的 地址， 返回给调用者
        return arr;
    }

}
