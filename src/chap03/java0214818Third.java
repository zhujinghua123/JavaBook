package chap03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description 9月13日作业
 * @Author 住京华
 * @Date 2022/9/16-上午 05:25
 */
public class java0214818Third {
    //3.1
    static double r1(double a, double b, double d) {
        return (-b + Math.sqrt(d)) / 2 * a;
    }

    static double r2(double a, double b, double d) {
        return (-b - Math.sqrt(d)) / 2 * a;
    }

    static void problem3_1() {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double tmp = Math.pow(b, 2) - 4 * a * c;
        System.out.print("The equation has ");
        if (tmp == 0) {
            System.out.println("one root " + r1(a, b, tmp));
        } else if (tmp > 0) {
            System.out.println("two roots " + r1(a, b, tmp) + " and " + r2(a, b, tmp));
        } else {
            System.out.println("no real roots");
        }
    }

    //3.15
    static void problem3_15() {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 900) + 100;
        System.out.print("Enter your number:");
        int tmp = sc.nextInt();
        int[] arr1 = {number % 10, number / 10 % 10, number / 100};
        int[] arr2 = {tmp % 10, tmp / 10 % 10, tmp / 100};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1[0] == arr2[0] || arr1[1] == arr2[1] || arr1[2] == arr2[2]) {
            System.out.println("You earned 1000$");
        }
        if (tmp == number) {
            System.out.println("You earned 10000$");
        }
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("You earned 3000$");
        }
        if (arr1[0] != arr2[0] && arr1[1] != arr2[1] && arr1[2] != arr2[2]) {
            System.out.println("You earned no money");
        }
    }

    //3.6
    static void problem3_6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double weight = sc.nextDouble();
        System.out.print("Enter feet:");
        double feet = sc.nextDouble();
        System.out.print("Enter inches");
        double inches = sc.nextDouble();
        double result = (weight / 2.2046) / Math.pow(((feet * 0.3048) + (inches * 0.0254)), 2);
        System.out.println("BMI is " + result);
        if (result > 18.5 && result <= 24.9) {
            System.out.println("Normal");
        }
        if (result <= 18.5) {
            System.out.println("Thin");
        }
        if (result > 24.9) {
            System.out.println("Fat");
        }
    }

    //3.34
    static void problem3_34() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three points:");
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        if (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //3.23
    static void problem3_23() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (Math.abs(x - 5) >= 0 && Math.abs(y - 2.5) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //3.30
    static void problem3_30() {
        Scanner sc = new Scanner(System.in);
        long totalsec = System.currentTimeMillis() / 1000;
        System.out.print("Enter the zone offset to GMT:");
        int num = sc.nextInt();
        long currentsconds = totalsec % 60;
        long currentimes = totalsec / 60 % 60;
        long currenthours = totalsec / 60 / 60 % 24;
        System.out.println("Time is " + (currenthours + num) % 12 + ":" + currentimes + ":" + currentsconds);
    }


    public static void main(String[] args) {
        problem3_1();
        problem3_15();
        problem3_6();
        problem3_34();
        problem3_23();
        problem3_30();

    }


}
