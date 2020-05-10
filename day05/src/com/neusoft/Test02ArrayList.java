package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/5/10 20:41
 */
public class Test02ArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }
        // 打印随机生成的20个数
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ ", ");
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // 调用一个方法， 筛选出list里面所有的偶数组成的新集合
        ArrayList<Integer> list1 = getArrayList(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+ ", ");
        }


    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
        // 创建一个小集合，存储偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        // 遍历传入list
        for (int i = 0; i < list.size(); i++) {
            //获取每一个元素
            Integer num = list.get(i);
            if (num%2 ==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
