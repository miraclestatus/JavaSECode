package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/5/17 16:11
 */
public class StringDemo3 {
    private char value[];

    public StringDemo3(char[] value) {
        this.value = value;
    }

    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof StringDemo3) {
            StringDemo3 anotherString = (StringDemo3)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }



}
