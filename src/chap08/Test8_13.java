package chap08;

import java.util.Scanner;

public class Test8_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] array = new double[row][col];
        System.out.println("Enter the array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        int[] loc = new int[2];
        loc = locateLargest(array);
        System.out.print("The location of the largest element is at (" + loc[0] + ", " + loc[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] loc = new int[2];
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        return loc;
    }
}
