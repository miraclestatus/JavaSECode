package com.neusoft;

public class Main {

    public static void main(String[] args) {
	// write your code her
        // String类 Java.lang包下
        String s1 = "abc";
//        System.out.println(s1);
        String s2 = "abc";
        System.out.println(s1==s2); // true
//        System.out.println(s2);
//        s1 += "d";
//        System.out.println(s1);
        // 上面abc的创建相当于 new string 传入char型数组
        char data[] = {'a', 'b', 'c'};
        String string = new String(data); // String底层是 字符数组实现的
        System.out.println(string);
        System.out.println(string==s1); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(string)); //true
//        String abc = new String("abc");
//        System.out.println(abc);


    }
}
