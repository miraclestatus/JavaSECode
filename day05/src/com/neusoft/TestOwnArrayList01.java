package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/10 21:07
 */
public class TestOwnArrayList01 {
    public static void main(String[] args) {
//        OwnArrayList01 list01 = new OwnArrayList01();
        OwnArrayList01 list01 = new OwnArrayList01(15);
        System.out.println(list01.getCapacity());
        System.out.println(list01.getSize());
        System.out.println(list01.isEmpty());
    }
}
