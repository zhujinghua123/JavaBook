package chap02;

/**
 * 0214726������    p64 ��Ŀ2.5  ����Ӧ�ã�����С��
 */

import java.util.Scanner;

public class Test205 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate : ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = 0.01 * rate * subtotal;
        double total = subtotal + gratuity;
        System.out.print(" The gratuity is $" + gratuity + " and total is &" + total);

        input.close();
    }
}