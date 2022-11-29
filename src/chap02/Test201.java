package chap02;

/**
 * 0214726������    p63 ��Ŀ2.1  �����϶�ת��Ϊ���϶�
 */

import java.util.Scanner;

public class Test201 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        input.close();
    }
}
