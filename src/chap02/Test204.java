package chap02;

/**
 * 0214726������    p64 ��Ŀ2.4  ����ת��Ϊǧ��
 */

import java.util.Scanner;

public class Test204 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for pounds : ");
        double pounds = input.nextDouble();
        double kilograms = 0.454 * pounds;

        System.out.print(pounds + " pounds is " + kilograms + " kilograms");

        input.close();
    }
}