package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/26 19:16
 */
public class Test02_Phone {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();
//        Phone p2 = new Phone();
//
//
//        // 输出成员变量
//        System.out.println(p.brand);
//        System.out.println(p.color);
//        System.out.println(p.price);
//        System.out.println("=========");

        // 赋值
        p.brand = "Apple11pro";
        p.color = "green";
        p.price = 9999;
        show(p);
//
//        p2.brand = "华为";
//        p2.color = "black";
//        p2.price = 5999;
//
//        // 再次输出
//        System.out.println(p.brand);
//        System.out.println(p.color);
//        System.out.println(p.price);
//        System.out.println("=========");
//        // 调用打电话方法
//        p.call("马云");
//        // 调用发短信方法
//        p.sendMessage();
    }
    // 对象作为参数进行传递
    public static void show(Phone phone){
        System.out.print(phone.brand+phone.color+phone.price);
    }
}
