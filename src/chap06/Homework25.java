package chap06;

import java.util.Scanner;

public class Homework25 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = input.nextLine();

        long input1 = Long.parseLong(str);
        String output = convertMillis(input1);
        System.out.println(output);


    }

    public static String convertMillis(long millis) {
        millis /= 1000;
        int moment = (int) (millis % 60);
        millis /= 60;

        int minute = (int) (millis % 60);
        millis /= 60;

        int hour = (int) millis;
        return hour + ":" + minute + ":" + moment;
    }
}
