package chap06;

import java.util.Scanner;

public class Test6_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double input_area = area(s);

        System.out.print("The area of the pentagon is " + input_area);
    }

    public static double area(double s) {
        return (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}