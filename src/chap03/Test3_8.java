package chap03;
/**
 * ������������������
 */

import java.util.Scanner;

public class Test3_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������������� : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.print(a + " " + b + " " + c);
        sc.close();
    }
}
