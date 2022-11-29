package chap02;

import java.util.Scanner;

public class Test2_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = 0.305 * feet;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
