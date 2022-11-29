package chap06;

import java.util.Scanner;

public class Homework27 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("请输入number值：");
        int number = input.nextInt();
        System.out.print("请输入width值：");
        int width = input.nextInt();


        String str = format(number, width);


        System.out.println(str);
    }

    public static String format(int number, int width) {
        String number_trans = "" + number;
        String str = "";
        int length = number_trans.length();
        if (length > width)
            return number_trans;
        else {
            for (int i = 1; i <= (width - length); i++) {
                str += "0";
            }
            str += number;
            return str;
        }

    }

}
