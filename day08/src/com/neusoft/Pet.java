package com.neusoft;

public interface Pet {
    public void shouYang();
    // 多实现抽象方法重名
    public void show();
    // 多实现默认方法重名
    public  default void  method(){
        System.out.println("Pet!");
    }
}
