package chap02;

/**
 * 0214726������    p63 ��Ŀ2.3 ��Ӣ��ת������
 */

import java.util.Scanner;

public class Test203 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet : ");
        double feet = input.nextDouble();                     /** 0214726������    p63 ��Ŀ2.3 ��Ӣ��ת������ */
/** 0214726������    p63 ��Ŀ2.3 ��Ӣ��ת������ */
        double meters = 0.305 * feet;

        System.out.print(feet + " feet is " + meters + " meters");

        input.close();
    }
}
