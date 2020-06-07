package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/7 14:25
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.run(); // 报错。 无法继承方法，也无法调用
        LiveAble.run();
    }
}
