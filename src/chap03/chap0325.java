package chap03;

import java.util.Scanner;

public class chap0325 {

    public static void main(String[] args) {
        // 获取四个点的数据
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();
        double x4 = input.nextDouble(), y4 = input.nextDouble();

        // 根据Cramer规则转换为a b c d e f
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        // 判断a*d-b*c是否为0（是否有根，是否平行）
        if (a * d - b * c == 0) {
            System.out.println("The two lines are parallel");
            System.exit(1);
        }

        // 求x、y值
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("The intersecting point is at (" + x + ", " + y + ")");


    }

}
