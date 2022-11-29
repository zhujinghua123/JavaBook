package chap06;

import java.util.Scanner;

public class Test6_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();

        System.out.println("i\t\tm(i)");
        for (int i = 1; i <= b; i++) {
            System.out.print(i + "\t\t");
            getsum(i);
        }
        input.close();

    }

    public static void getsum(int i) {
        float sum = 0;
        for (int a = 1; a <= i; a++) {
            sum = sum + (float) a / (a + 1);
        }

        System.out.printf("%.4f\n", sum);

    }
}
