package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/4/19 20:10
 * 猜数字
 */
public class RandomDemo13 {
    public static void main(String[] args) {
        Random random = new Random();
        int guessNum = random.nextInt(100) + 1;
        int inputNum = 0;
        while (true){
            // 提示用户输入
            System.out.println("请输入您要猜的数字（1~100）");
            Scanner scanner = new Scanner(System.in);
            inputNum = scanner.nextInt();
            if (inputNum > guessNum)
                System.out.println("猜大了");
            else if (inputNum < guessNum)
                System.out.println("猜小了");
            else {
                System.out.println("恭喜你获奖了，您将获得价值200元的兰博基尼代金券");
                break;
            }
        }


    }
}
