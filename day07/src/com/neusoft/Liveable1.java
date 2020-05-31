package com.neusoft;

public interface Liveable1 {
    // 默认方法， 可以重写， 也可以继承，但是只能通过实现类来调用
    // 1/继承默认方法
    public default  void fly(){
        System.out.println("天上飞");
    }
    // 重写
}
