package chap02;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a degree in celsius");
        double c = scanner.nextDouble();
        double f = (9.0 / 5) * c + 32;
        System.out.println(c + " Celsius is " + f + " Fahrenheit");

    }

}
