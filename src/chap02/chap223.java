package chap02;

import java.util.Scanner;

public class chap223 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入距离 ");
        double dis = input.nextDouble();
        System.out.print("输入一英里耗油量");
        double pg = input.nextDouble();
        System.out.print("输入一加仑的油价");
        double pri = input.nextDouble();
        System.out.print("总价为 &");
        System.out.print(dis / pg * pri);

    }

}
