package chap02;

import java.util.Scanner;

/**
 * @Author 住京华
 * @Description 9月6作业
 * @Date 2022/9/6-下午 10:17
 */
public class java0214818Second {
    //2.2
    static void problem2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("The area is " + Math.PI * radius * radius);
        System.out.println("The volume is " + Math.PI * radius * radius * length);
    }

    //2.6
    static void problem6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = input.nextInt();
        int result = 0;
        for (int i = 1; i < 4; i++) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }

    //2.8
    static void problem8() {
        Scanner input = new Scanner(System.in);
        long totalsec = System.currentTimeMillis() / 1000;
        System.out.print("Enter the zone offset to GMT:");
        int num = input.nextInt();
        long currentsconds = totalsec % 60;
        long currentmins = totalsec / 60 % 60;
        long currenthours = totalsec / 60 / 60 % 24;
        System.out.println("Time is " + (currenthours + num) + ":" + currentmins + ":" + currentsconds);
    }

    //2.16
    static void problem16() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length:");
        double length = input.nextDouble();
        System.out.println("The area is:" + (3 * Math.sqrt(3) * Math.pow(length, 2)) / 2);
    }

    //2.19
    static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    static void problem19() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s = (length(x1, y1, x2, y2) + length(x2, y2, x3, y3) + length(x3, y3, x1, y1)) / 2;
        System.out.println("The area is " + Math.sqrt(s * (s - length(x1, y1, x2, y2)) *
                (s - length(x2, y2, x3, y3)) * (s - length(x3, y3, x1, y1))));
    }

    //2.21
    static void problem21() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money:");
        double money = input.nextDouble();
        System.out.print("Enter the rate:");
        double rate = input.nextDouble();
        System.out.print("Enter the year:");
        int year = input.nextInt();
        System.out.print("Future value is " + money * Math.pow((1 + rate / 100 / 12), year * 12));
    }

    public static void main(String[] args) {
        problem2();
        problem6();
        problem8();
        problem16();
        problem19();
        problem21();
    }
}
