package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 16:29
 * 打印 1 天内 所有的时间格式
 * 格式是 12时 48 分
 */
public class ForForDemo04 {
    public static void main(String[] args) {
        //1. 定义外循环, 控制小时的变化.
        for (int hour = 0; hour <= 23 ; hour++) {
            //2. 定义内循环, 控制分钟的变换.
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + "时" + minute + "分");
            }
        }
    }

}
