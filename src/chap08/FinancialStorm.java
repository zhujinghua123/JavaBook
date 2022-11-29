package chap08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description 8.17
 * @Author 住京华
 * @Date 2022/10/18-下午 10:04
 */
public class FinancialStorm {
    private int n;//银行数量
    private int limit;//最小资产
    private double[][] borrowers;//贷款数组
    private double[] money;//资产数组

    public FinancialStorm() {
        input();
        check();
    }

    public void input() {
        System.out.print("Enter the n and limit:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        limit = sc.nextInt();
        borrowers = new double[n][n];//数组初始化
        money = new double[n];//初始化
        for (int i = 0; i < n; ++i) {
            money[i] = sc.nextDouble();//第一个数据
            int t = sc.nextInt();//贷款银行的数量
            for (int j = 0; j < t; ++j) {
                borrowers[i][sc.nextInt()] = sc.nextDouble();
            }
        }
    }

    public void check() {
        //标记数组
        boolean[] flags = new boolean[n];
        Arrays.fill(flags, true);
        double[] temp = new double[n];//记录每一行贷款的和
        for (int i = 0; i < n; ++i) {
            temp[i] = money[i];
            for (int j = 0; j < n; ++j) {
                temp[i] += borrowers[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            if (temp[i] < limit && flags[i]) {
                flags[i] = false;
                //重新计算数据
                for (int j = 0; j < n; ++j) {
                    borrowers[j][i] = 0;
                }
                for (int k = 0; k < n; ++k) {
                    temp[k] = money[k];
                    for (int v = 0; v < n; ++v) {
                        temp[k] += borrowers[k][v];
                    }
                }
                //重新循环
                i = -1;
            }
        }

        System.out.print("Unsafe banks are ");
        for (int i = 0; i < n; ++i)
            if (!flags[i]) {
                System.out.print(i + " ");
            }
    }

}
    

