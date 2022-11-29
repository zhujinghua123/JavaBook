package chap03;

import java.util.Scanner;

public class Test3_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t1 = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double v0 = input.nextDouble();


        if (t1 > 41 || t1 < -51 || v0 < 2) {
            System.out.println("温度或风速是不合法数据");
            System.exit(1);
        }
        double v = Math.pow(v0, 0.16);


        double t0 = 35.74 + 0.6125 * t1 - 35.75 * v + 0.4275 * t1 * v;

        System.out.println("The wind chill index is " + t0);
    }
}
