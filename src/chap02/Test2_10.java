package chap02;

import java.util.Scanner;

/**
 * 0214726������    p64 ��Ŀ2.10  ��ѧ����������
 */
public class Test2_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double tem0 = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double tem1 = input.nextDouble();
        double Q = M * (tem1 - tem0) * 4184;
        System.out.println("The energy needed is " + Q);
        input.close();
    }
}
