package chap02;

/**
 * 0214726������    p67 ��Ŀ2.23  ��ʻ����
 */

import java.util.Scanner;

public class Test223 {

    public static void main(String[] args) {
        // ��ȡ����
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        // ������ò����
        System.out.print("The cost of driving is $");
        System.out.printf("%.2f", ((price * distance) / miles));
        input.close();
    }
}
