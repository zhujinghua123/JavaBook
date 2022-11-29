package chap08;

import java.util.Scanner;

public class Test8_25 {
    public static void main(String[] args) {

        double[][] array = new double[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(array)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        double temp = 0;

        for (int j = 0; j < m[0].length; j++) {
            temp = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i][j] < 0) {
                    return false;
                }
                temp += m[i][j];
            }
            if (temp != 1) {
                return false;
            }
        }
        return true;
    }
}

