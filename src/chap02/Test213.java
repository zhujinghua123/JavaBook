package chap02;

/**
 * 0214726������ p65 ��Ŀ2.13  ����Ӧ�ã�����ֵ
 */

import java.util.Scanner;

public class Test213 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving account : ");
        double account = input.nextDouble();
        System.out.print("Enter the month you plan to save : ");
        int n = input.nextInt();

        double total = 0;
        double rate = 0.00417;
        for (int i = 0; i < n; i++) {
            total = total + account;
            total = total * (1 + rate);
        }
        System.out.print("After the " + n + "month , the account value is $");
        System.out.printf("%.3f", total);
        input.close();
    }
}
