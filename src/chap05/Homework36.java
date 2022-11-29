package chap05;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年9月17日 下午7:43:31
 * @description:
 */
public class Homework36 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i, temp, count, result, number10;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        i = scanner.nextInt();
        temp = i;

        str = "";
        if (i / 100000000 == 0) {
            str = "0";
        }
        str = str + temp;
        count = 0;
        result = 0;
        for (int m = 100000000; m >= 1; m /= 10) {
            ++count;
            result = count * i / m;
            i %= m;
        }

        number10 = result % 11;
        if (number10 < 10) {
            str += number10;
        } else {
            str += "X";
        }
        System.out.println("The ISBN-10 number is " + str);


    }

}
