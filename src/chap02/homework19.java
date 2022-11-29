package chap02;

import java.util.Scanner;

public class homework19 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double s1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double s2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double s3 = Math.sqrt(+(x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double s = (s1 + s2 + s3) / 2;
        double square = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("the area of the triangle is : " + square);

    }

}
