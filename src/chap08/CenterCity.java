package chap08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Description 8.21
 * @Author 住京华
 * @Date 2022/10/19-下午 05:24
 */
public class CenterCity {
    private int n;//长度
    private double[][] arr;//数组
    private double[] TotalLen;//储存距离

    public CenterCity() {
        Input();
        GetLength(arr);
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; ++i) index[i] = i;
        Arrays.sort(index, Comparator.comparingDouble(value -> TotalLen[value]));//下标排序
        System.out.println("The center city is at (" + arr[index[0]][0] + "," + arr[index[0]][1] + ")");
        System.out.print("The total distance to all other cities is " + TotalLen[index[0]]);
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cities:");
        n = sc.nextInt();
        arr = new double[n][2];
        System.out.print("Enter the coordinates of the cities:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 2; ++j) {
                double t = sc.nextDouble();
                arr[i][j] = t;
            }
        }
    }

    public void GetLength(double[][] arr) {
        TotalLen = new double[n];
        for (int i = 0; i < n; ++i) {
            double temp = 0;
            for (int j = 0; j < n; ++j) {
                temp += Math.sqrt(Math.pow(arr[i][0] - arr[j][0], 2) + Math.pow(arr[i][1] - arr[j][1], 2));
            }
            TotalLen[i] = temp;
        }
    }
}
