package chap08;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年10月23日 下午8:56:29
 * @description:
 */
public class Homework33 {
    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double[][] points = new double[4][2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = in.nextDouble();
            }
        }
        double array[] = getIntersectingPoint(points);

        double x = array[0];
        double y = array[1];
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];
        double[] S = new double[4];
        S[0] = Math.abs((x1 * y2 + x2 * y + x * y1 - x1 * y - x2 * y1 - x * y2) / 2);
        S[1] = Math.abs((x1 * y4 + x4 * y + x * y1 - x1 * y - x4 * y1 - x * y4) / 2);
        S[2] = Math.abs((x3 * y2 + x2 * y + x * y3 - x3 * y - x2 * y3 - x * y2) / 2);
        S[3] = Math.abs((x3 * y4 + x4 * y + x * y3 - x3 * y - x4 * y3 - x * y4) / 2);
        bubble(S);
        System.out.println();
        System.out.print("The areas are ");
        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                System.out.print(S[i]);
            } else {
                System.out.print(S[i] + " ");
            }
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];
        double K1 = (y1 - y3) / (x1 - x3);
        double K2 = (y2 - y4) / (x2 - x4);
        double[] arr = new double[2];
        double B1 = y1 - K1 * x1;
        double B2 = y2 - K2 * x2;
        arr[0] = (B2 - B1) / (K1 - K2);
        arr[1] = (B2 * K1 - B1 * K2) / (K1 - K2);
        return arr;
    }

    public static void bubble(double[] S) {
        double temp;
        for (int i = 0; i < S.length; i++) {
            for (int j = S.length - 1; j > i; j--) {
                if (S[j] < S[j - 1]) {
                    temp = S[j - 1];
                    S[j - 1] = S[j];
                    S[j] = temp;
                }
            }
        }
    }
}
