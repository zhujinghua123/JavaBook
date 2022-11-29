package chap03;

import java.util.Scanner;

public class chap0309 {
    public static void main(String[] args) {
        // 获取数据
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String temp = input.next();
        int i = Integer.parseInt(temp);

        // 处理数据：赋值d1~d9
        int d1 = i / 100000000;
        i %= 100000000;
        int d2 = i / 10000000;
        i %= 10000000;
        int d3 = i / 1000000;
        i %= 1000000;
        int d4 = i / 100000;
        i %= 100000;
        int d5 = i / 10000;
        i %= 10000;
        int d6 = i / 1000;
        i %= 1000;
        int d7 = i / 100;
        i %= 100;
        int d8 = i / 10;
        i %= 10;
        int d9 = i;

        // 求d10
        int d10 = (1 * d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;

        // 输出
        String str;
        if (d10 < 10) {
            str = temp + d10;
        } else {
            str = temp + "X";
        }
        System.out.println("The ISBN-10 number is " + str);
    }
}
