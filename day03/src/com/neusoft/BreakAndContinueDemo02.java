package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 16:25
 */
public class BreakAndContinueDemo02 {
    public static void main(String[] args) {
        // 关于continue的入门案例
        // 打印 1~ 10之间 所有不是3倍数整数
        for (int i = 1; i <= 10 ; i++) {
            //  判断该数字是否为 3的倍数
            if (i % 3==0)
                continue;
            // 如果不是3的倍数，就打印他
            System.out.println(i);
        }

    }
}
