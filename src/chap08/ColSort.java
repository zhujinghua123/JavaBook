package chap08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description 8.27
 * @Author 住京华
 * @Date 2022/10/19-下午 07:26
 */
public class ColSort {
    private double[][] arr = new double[3][3];//矩阵
    private double[][] res;//结果数组

    public ColSort() {
        Input();
        System.out.print("The ColSort array is" + Arrays.deepToString(sortColumns(res)));
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3by3 matrix row by row:");
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                arr[i][j] = sc.nextDouble();
            }
        }
        res = arr.clone();
    }

    public double[][] sortColumns(double[][] m) {
        double[][] temp = new double[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                temp[i][j] = m[j][i];
            }
        }
        for (int i = 0; i < 3; ++i) Arrays.sort(temp[i]);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                m[i][j] = temp[j][i];
            }
        }
        return m;
    }
}
