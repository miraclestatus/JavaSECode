package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/5/10 19:36
 */
public class Test01ArrayList {
    public static void main(String[] args) {
        // 生成 10个 1到 33之间的随机整数，添加到集合中, 并且遍历输出

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }
        printArrayList(list);
    }
    // 自定义方法打印 list
    public static void printArrayList(ArrayList<Integer> list){
        // 拼接左括号
        System.out.print("[");
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 获取元素
            Integer num = list.get(i);
            if (i != list.size()-1){
                System.out.print(num + ", ");
            }else {
                // 拼接右括号
                System.out.println(num + "]");
            }

        }

    }

}
