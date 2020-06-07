package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/7 14:23
 */
public abstract  class Animal implements LiveAble {

    public abstract  void eat();

    @Override
    public void func() {

    }

    @Override
    public void show() {

    }
// 无法重写静态方法
}
