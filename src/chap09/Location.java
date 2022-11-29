package chap09;

import java.util.Scanner;

/**
 * @Description 9.13
 * @Author 住京华
 * @Date 2022/10/11-上午 11:27
 */
public class Location {

    int row;
    int column;
    double maxValue;

    public static Location locateLargest(double[][] a) {
        Location res = new Location();
        res.maxValue = 0;
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[0].length; ++j) {
                if (a[i][j] > res.maxValue) {
                    res.row = i;
                    res.column = j;
                }
                res.maxValue = Math.max(res.maxValue, a[i][j]);
            }
        return res;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns in the array:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] arr = new double[m][n];
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; ++i)
            for (int j = 0; j < arr[0].length; ++j)
                arr[i][j] = sc.nextDouble();
        System.out.print("The location of the largest element is " + locateLargest(arr).maxValue + " at " +
                locateLargest(arr).row + "," + locateLargest(arr).column);
    }
}
