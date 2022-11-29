package chap05;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年9月17日 下午4:30:45
 * @description:
 */
public class Homework30 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("输入金额数：");
        double amount = input.nextDouble();
        System.out.println("输入年利率：");
        double rate = input.nextDouble() / 1200;
        System.out.println("输入月份数：");
        int month = input.nextInt();
        double balance = 0;
        for (int i = 1; i <= month; i++) {
            balance = (amount + balance) * (1 + rate);
        }

        System.out.println(balance);


    }

}
