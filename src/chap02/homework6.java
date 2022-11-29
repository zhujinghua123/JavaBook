package chap02;

import java.util.Scanner;

public class homework6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number between 0 and 1000 :");
        int number = scanner.nextInt();
        int a = number / 1000;
        int b = number / 100;
        int c = (number / 10) % 10;
        int d = number % 10;
        int sum = a + b + c + d;
        if (number > 0 && number < 1000) {
            System.out.println(" the sum of the digits is : " + sum);
        }
    }

}
