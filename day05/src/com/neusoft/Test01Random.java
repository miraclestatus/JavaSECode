package com.neusoft;

import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/5/10 16:57
 */
public class Test01Random {
    public static void main(String[] args) {
        // Random 类用于生成伪随机数
        Random random = new Random();
        // [0, n) 的随机整数
        for (int j = 0; j <10 ; j++) {
            int i = random.nextInt(1);
            System.out.println(i);
        }



    }
}
