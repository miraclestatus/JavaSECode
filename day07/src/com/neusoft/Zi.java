package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/31 14:38
 */
public class Zi extends Fu {
    int num = 6;

//    public void show(){
//        System.out.println("Fu num="+super.num);// 调用父类的成员变量
//        System.out.println("Zi num="+this.num); // 调用子类的成员变量
//    }
// 重写 父类的方法建议使用该注解进行标识
    @Override
    public void show(){
        System.out.println("zi类的show方法执行");
    }
}
