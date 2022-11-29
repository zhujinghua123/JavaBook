package chap05;

import java.util.Scanner;

public class chap0539 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入目标总收入：");
        int target = input.nextInt() - 5000;

        // 判断大小
        int boundary1 = 400;
        int boundary2 = 900;
        boolean bool1 = (target > boundary1) && (target > boundary2);
        boolean bool2 = (target > boundary2) || (target > boundary1);

        // 计算最小销售额
        if ((bool1 && bool2 == true) && (bool1 || bool1 == true)) {
            //大于10 000部分
            System.out.printf("最小销售额为：%.2f", (target - boundary2) / 0.12 + 10000);
        } else if ((bool1 && bool2 == false) && (bool1 || bool1 == true)) {
            //小于5 000部分
            System.out.printf("最小销售额为：%.2f", target / 0.8);
        } else {
            // 大于5 000小于10 000部分
            System.out.printf("最小销售额为：%.2f", (target - boundary1) / 0.1 + 5000);
        }

    }

}
