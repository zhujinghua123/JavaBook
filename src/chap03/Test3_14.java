package chap03;

/**
 * ��Ϸ����Ӳ�ҵ�������
 */

import java.util.Scanner;

public class Test3_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = (int) (Math.random() * 2);
        System.out.print("please input a number 0 or 1:");
        int a = sc.nextInt();

        if (a != 0 && a != 1) {
            System.out.println("Incorrect data input");
        } else {
            if (a == r)
                System.out.println("You guessed it.");
            else
                System.out.println("Guess wrong");
        }
        sc.close();
    }
}

