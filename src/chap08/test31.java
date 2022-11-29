package chap08;

import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        //声明一个4*2的二维数组
        double[][] array = new double[4][2];
        //输出提示用户赋值的语句，并使用循环接收值
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        double[] intersection = new double[2];
        intersection = getIntersectingPoint(array);
        System.out.println("The intersecting point is at (" + intersection[0] + ", " + intersection[1] + ")");
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double a, c, e, f, b = 1, d = 1;
        a = -(points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        c = -(points[3][1] - points[2][1]) / (points[3][0] - points[2][0]);
        e = points[0][1] + a * points[0][0];
        f = points[2][1] + c * points[2][0];
        double[] center = new double[2];
        if (a == c) {
            System.out.println("The two lines are parallel");
            System.exit(1);
        }
        center[0] = (e * d - b * f) / (a * d - b * c);
        center[1] = (a * f - e * c) / (a * d - b * c);
        return center;
    }
}