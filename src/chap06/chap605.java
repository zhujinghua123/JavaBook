package chap06;

import java.util.Scanner;

public class chap605 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入3个数字");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        sortthreenum(num1, num2, num3);
    }

    public static void sortthreenum(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num2) {
            System.out.println(num1);
            if (num2 >= num3) {
                System.out.println(num2);
                System.out.println(num3);
            }
            if (num3 >= num2) {
                System.out.println(num3);
                System.out.println(num2);
            }
        }
        if (num2 >= num3 && num2 >= num1) {
            System.out.println(num2);
            if (num1 >= num3) {
                System.out.println(num1);
                System.out.println(num3);
            }
            if (num3 >= num1) {
                System.out.println(num3);
                System.out.println(num1);
            }
        }
        if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3);
            if (num2 >= num1) {
                System.out.println(num2);
                System.out.println(num1);
            }
            if (num1 >= num2) {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
