package chap03;

import java.util.Scanner;

public class chap0322 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入x1,y1的值: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        input.close();
        double a = Math.pow(x1, 2);
        double b = Math.pow(y1, 2);
        double dis = Math.pow(a + b, 0.5);
        if (dis > 10) System.out.print("点在⚪外");
        if (dis < 10) System.out.print("点在⚪内");


    }

}
