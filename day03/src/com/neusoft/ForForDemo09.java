package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/4/19 19:33
 *
 */
public class ForForDemo09 {
    // 带有标识的break 和continue
//    public static void main(String[] args) {
//       A: for (int i = 1; i <= 5 ; i++) {
//           B: for (int j = 1; j <= 5 ; j++) {
//                if (j== 3)
//                    break A;
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
    public static void main(String[] args) {
        // 打印 1 ~100 质数 3行一输出
        int count = 0;
        int flag = 3;
       a: for (int i = 2; i <= 100 ; i++) {
            for (int j = 2; j < i ; j++) {
                if (i % j == 0)
                    // 走到这里，说名不是质数
                    continue a;
            }
            System.out.print(i + (++count % flag == 0 ? " \n":"\t"));
        }
    }

}
