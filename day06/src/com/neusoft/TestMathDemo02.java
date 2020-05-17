package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 20:52
 */
public class TestMathDemo02 {
    public static void main(String[] args) {
        // 计算在-10.8 到 5.9之间
        // 绝对值大于等于6或者下雨2.1的整数有多少个
        double min = -10.8;

        double max = 5.9;

        int count = 0;

        for (double i = Math.ceil(min) ; i <= max ; i++) {
            System.out.println(i);
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println("共有"+count+"个");





    }
}
