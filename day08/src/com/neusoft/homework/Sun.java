package com.neusoft.homework;

/**
 * @author Eric Lee
 * @date 2020/6/7 19:39
 */
public class Sun extends  Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    public void shine(){
        System.out.println("sun:光照8分钟到达地球");
    }
}
