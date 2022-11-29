package chap02;

/**
 * 0214726������    p65 ��Ŀ2.14  �������⣺����BMI
 */

import java.util.Scanner;

public class Test214 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches : ");
        double height = input.nextDouble();

        double weight = 0.45359237 * pounds;
        double meters = 0.0254 * height;
        double bmi = weight / (meters * meters);
        System.out.print("BMI is ");
        System.out.printf("%.4f", bmi);

        input.close();
    }
}
