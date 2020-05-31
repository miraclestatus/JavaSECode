package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/31 14:38
 */
public class Zi extends Fu {
    int num = 6;
    public void show(){
        System.out.println("Fu num="+super.num);// 调用父类的成员变量
        System.out.println("Zi num="+this.num); // 调用子类的成员变量
    }
}
