package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/14 14:18
 */
public class Person {
    private boolean live = true;

    // 创建内部类
    class Heart {
        public  void  jump(){
            // 直接访问外部成员
            if (live){
                System.out.println("心扑通扑通的在调");
            }else{
                System.out.println("over");
            }
        }
    }
    public boolean isLive(){
        return live;
    }

    public void setLive(boolean live){
        this.live = live;
    }




}
