package chap06;

import java.util.Scanner;

public class Test6_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请您输入一个整数：");
        int user_input = Math.abs(input.nextInt());


        if (user_input == 0) {
            System.out.print("输入整数是0，是回文数");
            System.exit(1);
        }


        boolean bool = isPalindrome(user_input);
        if (bool)
            System.out.print("输入整数是回文数");
        else
            System.out.print("输入整数不是回文数");
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        String str = "";
        for (; number > 0; number /= 10) {
            str += number % 10;
        }
        return Integer.parseInt(str);
    }
}

