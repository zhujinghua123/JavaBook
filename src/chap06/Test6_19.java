package chap06;

import java.util.Scanner;

public class Test6_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入三条边的值：");
        double side1 = input.nextDouble(), side2 = input.nextDouble(), side3 = input.nextDouble();


        if (!isValid(side1, side2, side3)) {
            System.out.println("输入无效");
            System.exit(1);
        }


        System.out.println("这三角形的面积为：" + area(side1, side2, side3));
    }

    public static boolean isValid(double side1, double side2, double side3) {
        double temp = 0;
        if (side1 > side2) {
            temp = side1;
            side1 = side2;
            side2 = temp;
        }
        if (side1 > side3) {
            temp = side1;
            side1 = side3;
            side3 = temp;
        }
        if (side2 > side3) {
            temp = side2;
            side2 = side3;
            side3 = temp;
        }
        return (side1 + side2 > side3);
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
}
