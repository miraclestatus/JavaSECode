package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 18:35
 */
public class ArrayToString {
    public  String arrayToString(int[] arr){
        // c创建字符串对象
        String s = new String("[");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                // 右面拼接 】
                s = s.concat(arr[i] + "]");
            } else {
                // 拼接 #
                s = s.concat(arr[i] + "#");
            }

        }

        return s;
    }
}
