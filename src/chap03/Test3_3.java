package chap03;

import java.util.Scanner;

public class Test3_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        double d = input.nextDouble(), e = input.nextDouble(), f = input.nextDouble();


        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");

            return;
        }


        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);


        System.out.println("x is " + x + " and y is " + y);
    }
}
