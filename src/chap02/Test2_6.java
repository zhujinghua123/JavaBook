package chap02;

import java.util.Scanner;

public class Test2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = (int) (input.nextDouble());

        int a = number / 100;
        number %= 100;
        int b = number / 10;
        number %= 10;

        int total = a + b + number;

        System.out.println("The sum of the digits is " + total);
    }
}
