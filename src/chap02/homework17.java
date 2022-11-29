package chap02;

import java.util.Scanner;

public class homework17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("enter the temperature in fahrenheit between -58f and 41f:");
        double temper = input.nextDouble();
        System.out.print("enter the wind speed (>=2) in miles per hour: ");
        int speed = input.nextInt();
        if (speed >= 2) {
            double t = 35.74 + 0.6215 * temper - 35.75 * (Math.pow(speed, 0.16)) + 0.4275 * temper * (Math.pow(speed, 0.16));
            System.out.println("the wind chill index is" + t);
        }
    }
}
