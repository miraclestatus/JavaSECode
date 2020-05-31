package com.neusoft;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/5/31 15:02
 */
public class ExtendDemoTest5 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        // 子类中有show，只会执行重写后的show
        zi.show();
    }
}
