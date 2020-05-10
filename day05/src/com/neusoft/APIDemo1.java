package com.neusoft;
import java.util.Scanner;
/**
 * @author Eric Lee
 * @date 2020/5/10 15:26
 * API application programming interface 应用程序接口
 */
public class APIDemo1 {

    // 1、 Scanner类
    public static void main(String[] args) {
        // System.in 是指通过键盘录入数据
        Scanner scanner = new Scanner(System.in);
        // 出来java.lang包下的类不需要导入，其他的必须导入才能使用
        // 导包的格式: import 包名.类名;
        // 调用方法 变量名。方法名（）；
        int i = scanner.nextInt();
        System.out.println(i);
    }
    // 2、 Ramdom类
    // 3、 ArrayList类



}
