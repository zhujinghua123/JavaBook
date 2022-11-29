package chap03;

import java.util.Scanner;

public class chap326 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = input.nextInt();
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println("可以被5和6整除");
        }
        if (num % 5 == 0 || num % 6 == 0) {
            System.out.println("可以被5或者6整除");
        }
        if (num % 5 == 0 ^ num % 6 == 0) {
            System.out.println("可以被5抑或6整除");
        }

        input.close();
    }

}
