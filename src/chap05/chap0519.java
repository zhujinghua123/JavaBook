package chap05;

import java.util.Scanner;

public class chap0519 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            for (int m = 2; m <= i; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
