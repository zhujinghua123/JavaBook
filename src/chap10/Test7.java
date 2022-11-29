package chap10;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // �½�Test7_Account������
        Test7_Account[] arr = new Test7_Account[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Test7_Account(i, 100);
        }
        // ��ز���
        Scanner input = new Scanner(System.in);
        int id;
        while (true) {
            System.out.print("\nEnter an id: ");
            id = input.nextInt();
            if (id < 0 || id > 10) {
                System.out.println("������ȷid");
                continue;
            }
            boolean bool = true;
            while (bool) {
                System.out.println("\nMain menu");
                System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.printf("The balance is %.1f\n", arr[id].getBalance());
                }
                if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    arr[id].withDraw(withdraw);
                }
                if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    double deposit = input.nextDouble();
                    arr[id].deposit(deposit);
                }
                if (choice == 4) {
                    bool = false;
                }
            }
        }
    }
}
