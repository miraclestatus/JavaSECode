package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/26 15:26
 * 对数组进行反转
 * {1， 2， 3， 4， 5}
 * {5， 4， 3， 2， 1}
 * 1只要实现就行
 * 2 不创建新的数组
 */
public class ArrayDemo04 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        /**
         * for (初始化条件1,初始化条件2; 循环条件; 步进运算1,步进运算2)
         * 定义 min = 0 最小索引值， max = arr.length-1 最大索引值
         */

        for (int min =0,max = arr.length-1;min <= max; min++ , max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        // 重新遍历反转的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }




}
