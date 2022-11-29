package chap08;

import java.util.Arrays;

/**
 * @author: 洪洛安
 * @date: 2022年10月22日 下午10:19:12
 * @description:
 */
public class Homework7 {

    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}
        };
        double count = 0;
        double min = distance(points[0], points[1]);//第零行和第一行的距离
        double[] min1 = new double[3];
        double[] min2 = new double[3];
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                count = distance(points[i], points[j]);
                if (min > count) {
                    min = count;
                    min1 = points[i];//0到6
                    min2 = points[j];//1到7
                }
            }
        }

        System.out.println(Arrays.toString(min1) + "\n" + Arrays.toString(min2));
    }

    public static double distance(double[] a, double[] b) {

        double distance = 0;
        for (int i = 0; i < a.length; i++) {
            distance += Math.pow(b[i] - a[i], 2);//a和b代表不同行，三个元素代表xyz
        }
        return Math.sqrt(distance);//开根号
    }
}
	