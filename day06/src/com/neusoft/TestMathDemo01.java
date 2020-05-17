package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 20:42
 */
public class TestMathDemo01 {
    public static void main(String[] args) {
        // abs(double a)返回 double 值的绝对值。
        double i = Math.abs(-6.3);

        System.out.println(i);
        // ceil(double a) 返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
        // 返回大于等于参数的最小整数
        double ceil1 = Math.ceil(3.3);  // 4.0
        System.out.println(ceil1);
        double ceil2 = Math.ceil(-3.3);// -3.0
        System.out.println(ceil2);
        double ceil3 = Math.ceil(5.1); // 6.0
        System.out.println(ceil3);

        // round(double a) 返回最接近参数的 long。(四舍五入)
        long round1 = Math.round(5.5);
        System.out.println(round1);// 6
        long round2 = Math.round(5.4);
        System.out.println(round2); // 5
    }
}
