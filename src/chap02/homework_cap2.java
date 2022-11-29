package chap02;

import java.util.Scanner;

public class homework_cap2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入x1,y1的值: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("请输入x2,y2的值: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        input.close();
        double a = Math.pow(x1 - x2, 2);
        double b = Math.pow(y1 - y2, 2);
        double c = Math.pow(a + b, 0.5);
        System.out.print("两点之间的距离为: ");
        System.out.println(c);
    }

}
