package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/14 14:33
 */
public class InnerDemoTest2 {
    public static void main(String[] args) {
       FlyAble f =  new FlyAble() {
           @Override
           public void fly() {
               System.out.println("我要起飞了");
           }
       };
       // 调用 fly方法
        f.fly();

}
}
