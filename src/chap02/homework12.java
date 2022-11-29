package chap02;

import java.util.Scanner;

public class homework12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("enter speed and acceleration:");
        double speed = input.nextDouble();
        double a = input.nextDouble();
        double length = speed * speed / 2 / a;
        System.out.println("the mimimum runway length for this airplane is " + length);
    }

}
