package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 15:06
 */
public class StringDemo2 {
    public static void main(String[] args) {
        // 2、int  length() 返回此字符串的长度。 实际调用的是 底层length数组的属性
        // 阅读源码， 源码的书写都是很严谨标准，学习， 2好公司面试经常会问
        String s = "helloword";
//        System.out.println(s.length());
//        System.out.println("+++++++++++++++++++++");
//        //3、 concat(String str)  将指定字符串连接到此字符串的结尾 字符串拼接很像
//        String s1 = s.concat("**hello");
//        System.out.println(s1);
//        // 4、charAt(int index) 返回指定索引处的 char 值。
//        char c = s.charAt(0);
//        System.out.println(c);
//        char c2 = s.charAt(1);
//        System.out.println(c2);
//        // 5、 indexOf(String str) 返回指定子字符串在此字符串中第一次出现处的索引。
//        // 没有返回-1、
//        System.out.println(s.indexOf("z"));
//
//        //substring(int beginIndex, int endIndex)
        // [beginIndex , endIndex) 包含beginIndex 不含 endIndex
//        // 返回一个新字符串，它是此字符串的一个子字符串。
        String s2 = s.substring(2);
        System.out.println(s.substring(5)); //

        System.out.println(s.substring(0,s.length()));
        System.out.println(s.substring(3, 9));

    }
}
