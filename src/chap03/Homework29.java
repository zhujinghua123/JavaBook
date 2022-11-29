package chap03;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年9月17日 下午3:06:43
 * @description:
 */
public class Homework29 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter circle1's center x-, y-coordinates, and radius:  ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.print("enter circle2's center x-, y-coordinates, and radius:  ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is  inside circle1");
        } else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= (r1 + r2)) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }


    }

}
