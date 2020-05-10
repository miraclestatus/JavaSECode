package com.neusoft;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/5/10 18:17
 */
public class Test02Random {
    // 游戏开始生成一个 1 ~100之间的随机整数number， 玩家猜测一个数字guessNumber
    // 系统提示猜大了还是猜小了，知道玩家猜对
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入 1 ~100");
            int guessNumber = scanner.nextInt();
            if (guessNumber > number){
                System.out.println("大了");
            }else if (guessNumber < number){
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
            }

        }
    }



}
