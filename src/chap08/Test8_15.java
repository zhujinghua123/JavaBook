package chap08;

import java.util.Scanner;

public class Test8_15 {
    public static void main(String[] args) {

        int length_row = 5, length_col = 2;
        double[][] points = new double[length_row][length_col];

        System.out.print("Enter five points: ");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < length_row; i++) {
            for (int j = 0; j < length_col; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        boolean bool = sameLine(points);

        if (bool)
            System.out.println("The five points are on the same line");
        else
            System.out.println("The five points are not no the same line");
    }

    public static boolean sameLine(double[][] points) {

        for (int i = 2; i < points.length; i++) {
            if ((points[1][0] - points[0][0]) * (points[i][1] - points[0][1]) -
                    (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]) != 0)
                return false;
        }
        return true;
    }
}
