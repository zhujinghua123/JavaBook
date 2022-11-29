package chap05;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年9月17日 下午3:22:17
 * @description:
 */
public class Homework16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        int count = 1;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                count = 0;
            }
        }

        if (count != 0) {
            System.out.println(number);
        } else {
            for (int j = 2; number != 1; j++) {
                while (number % j == 0) {
                    System.out.print(j + ",");
                    number = number / j;
                }

            }


        }


    }
}
