package chap02;

import java.util.Scanner;

public class chap219 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入x1,y1 x2 y2 x3 y3的值: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double a = Math.pow(x1 - x2, 2);
        double b = Math.pow(y1 - y2, 2);
        double dis = Math.pow(a + b, 0.5);
        double a1 = Math.pow(x2 - x3, 2);
        double b1 = Math.pow(y2 - y3, 2);
        double dis1 = Math.pow(a1 + b1, 0.5);
        double a2 = Math.pow(x1 - x3, 2);
        double b2 = Math.pow(y1 - y3, 2);
        double dis2 = Math.pow(a2 + b2, 0.5);
        double s = (dis + dis1 + dis2) / 2;
        double area = Math.pow(s * (s - dis) * (s - dis1) * (s - dis2), 0.5);
        System.out.print("面积为 ");
        System.out.printf("%.1f", area);

    }

}
