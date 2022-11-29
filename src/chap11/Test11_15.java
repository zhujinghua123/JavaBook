package chap11;

import java.util.Scanner;

public class Test11_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多边形的顶点数:");
        int n = scanner.nextInt();

        double[] point = new double[n * 2];
        System.out.println("请输入多边形的顶点:");
        for (int i = 0; i < n * 2; i++) {
            point[i] = scanner.nextDouble();
        }

        Polygon p = new Polygon(n, point);

        System.out.println("该凸多边形面积为:" + p.getArea());
    }
}

class Polygon {

    private int n = 3;

    private double[] point = new double[n * 2];

    private double area = 0;

    public Polygon() {
    }

    ;

    public Polygon(int n, double[] point) {
        this.n = n;
        this.point = point;
    }

    public double getArea() {
        double ans1 = 0, ans2 = 0;
        int i = 0;
        int j = 3;

        while (i <= point.length - 2) {
            ans1 += (point[i] * point[j]);
            i += 2;
            j += 2;
            if (i == point.length - 2) {
                j = 1;
            }
        }

        i = 2;
        j = 1;
        while (j <= point.length - 1) {
            ans2 += (point[i] * point[j]);
            i += 2;
            j += 2;
            if (j == point.length - 1) {
                i = 0;
            }
        }
        return (Math.abs(ans1 - ans2)) / 2;
    }
}