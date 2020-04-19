package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 15:28
 * BreakAndContinue
 * break 跳出本层循环
 * continue 结束本次循环，进行下一次循环
 */
public class BreakAndContinueDemo01 {
    // 打印10次HelloWord， 当打印第六次的时候，结束循环
    public static void main(String[] args) {
        System.out.println("start");
        // 定义10次循环
        for (int i = 1; i <= 10 ; i++) {
            // 判断 i等于 6，结束循环
            if (i==6)
                break;
            System.out.println("HelloWord" + i);

        }
        System.out.println("end");

    }
}
