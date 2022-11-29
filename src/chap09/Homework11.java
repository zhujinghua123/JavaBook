package chap09;

import java.util.Scanner;

public class Homework11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double d = input.nextInt();
        double e = input.nextInt();
        double f = input.nextInt();
        LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);


        boolean bool = l1.isSolvable();

        if (bool) {
            System.out.println("x is " + l1.getX() + " and y is " + l1.getY());
        } else
            System.out.println("The equation has no solution");

    }

}

class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }


    public boolean isSolvable() {
        boolean bool = false;
        if (a * d - b * c != 0) {
            bool = true;
        }
        return bool;
    }


    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}