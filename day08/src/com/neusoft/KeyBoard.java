package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/7 18:44
 */
public class KeyBoard implements USB {


    @Override
    public void open() {
        System.out.println("键盘开启，小彩灯闪闪闪");

    }

    @Override
    public void close() {
        System.out.println("键盘关闭，小灯熄灭");

    }
    public void input(){
        System.out.println("键盘在疯狂的输入");
    }
}
