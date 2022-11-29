package chap02;

/**
 * 0214726������    p63 ��Ŀ2.2  ����Բ��������
 */

import java.util.Scanner;

public class Test202 {

    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder : ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;
        System.out.print("The aera is ");
        System.out.printf("%.4f", area);
        System.out.println("");
        System.out.print("The volume is ");
        System.out.printf("%.1f", volume);
        input.close();
    }
}
