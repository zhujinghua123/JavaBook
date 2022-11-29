package chap05;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年9月18日 上午8:38:15
 * @description:
 */
public class Homework47 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String str = scanner.nextLine();
        int length = str.length();
        if (length <= 8) {
            System.out.println(" wrong ");

        }

        long input = Long.parseLong(str);
        int l1 = 0, l2 = 0, result = 0;
        for (long i = 10000000000L; i >= 1; i /= 100) {
            l1 = (int) (input / (i * 10));
            l2 = (int) (input % (i * 10) / i);
            result = result + l1 + 3 * l2;
            input %= i;
        }
        result = 10 - result % 10;
        if (result == 10)
            result = 0;       //校验和为十替换成零
        System.out.print("The ISBN-13 number is " + str + result);

    }

}
