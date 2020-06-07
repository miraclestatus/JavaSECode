package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/7 18:52
 */
public class LapTopTest {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        // 开启
        laptop.run();
//        使用鼠标
        USB mouse = new Mouse();
        laptop.useUSB(mouse);
        // 使用键盘
        USB keyBoard = new KeyBoard();
        laptop.useUSB(keyBoard);

        // 笔记本关闭、
        laptop.shutDown();
    }
}
