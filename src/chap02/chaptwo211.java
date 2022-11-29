package chap02;

import java.util.Scanner;

public class chaptwo211 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int x = input.nextInt();
        double sec = x * 365 * 24 * 60 * 60;
        double bir = sec / 7;
        double die = sec / 13;
        double img = sec / 43;
        System.out.println("当前人口数: ");
        System.out.print(312032486 + bir - die + img);

        System.out.println("a  b  pow(a,b)");
        System.out.println("1  2   1");
        System.out.println("2  3   8");
        System.out.println("3  4   81");
        System.out.println("4  5   1024");
        System.out.println("5  6   15625");
    }

}
