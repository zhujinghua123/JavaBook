package chap03;

import java.util.Scanner;

/**
 * ���ڣ����Ҷһ�
 */
public class Test3_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter exchange rate : \n");
        double rate = sc.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int a = sc.nextInt();

        if (a != 0 && a != 1) {
            System.out.println("Incorrect input");
            System.exit(1);
        }

        System.out.println("Enter the dollar amount: ");
        double amount = sc.nextDouble();

        if (a == 0) {
            System.out.println("$" + amount + " is " + amount * rate + " yuan");
        } else
            System.out.println(amount + " yuan is $" + amount / rate);

        sc.close();
    }

}


