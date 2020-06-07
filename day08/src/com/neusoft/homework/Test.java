package com.neusoft.homework;

/**
 * @author Eric Lee
 * @date 2020/6/7 19:41
 */
public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("=====================");
        Universe universe = new Sun();
        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.shine();
    }
}
