package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/8 17:25
 */
public class TestArray {
    public static void main(String[] args) {
        Array array = new Array(18);
        System.out.println(array.getCapacity());
        System.out.println(array.getSize());
        System.out.println(array.isEmpty());

    }
}
