package chap03;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年9月16日 下午10:21:03
 * @description:回文数
 */
public class Homework12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();
        int a = number / 100;
        int b = number % 10;
        if (number >= 100 && number < 999) {
            if (a == b) {
                System.out.println(number + " is a palindrome");

            } else {
                System.out.println(number + " is not a palindrome");
            }

        }
    }
}