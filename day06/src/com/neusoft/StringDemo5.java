package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 16:26
 */
public class StringDemo5 {
    public static void main(String[] args) {
        // 9 split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String s = "aa,bb ,cc dd";
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}
