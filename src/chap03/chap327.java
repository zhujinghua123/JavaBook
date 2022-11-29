package chap03;

import java.util.Scanner;

public class chap327 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1;
        final double y = 100;
        final double x = 200;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        if (x1 < x && y1 < y) System.out.print("在三角形内部");
        else {
            System.out.print("不在三角形内部");
        }


    }

}
