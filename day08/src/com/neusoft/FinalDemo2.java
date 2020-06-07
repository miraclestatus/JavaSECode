package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/7 20:55
 */
public class FinalDemo2 {
    public static void main(String[] args) {
        // 引用类型的局部变量，被final修饰，只能指向一个对象，地址值是不能改变的，
//        但是不影响对象内部成员变量值的修改
        final User user1 = new User();  // user1地址值不能改变 ox666
        System.out.println(user1.getName());
        // user1 = new User(); //
        user1.setName("李四");
        System.out.println(user1.getName());



    }
}
