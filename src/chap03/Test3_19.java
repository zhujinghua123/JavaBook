package chap03;

import java.util.Scanner;

/**
 * ���������ε��ܳ�
 */
public class Test3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter three numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a)
            System.out.printf("Perimetro = %.1f\n", a + b + c);
        else
            System.out.printf("Invalid input");
        sc.close();
    }
}
