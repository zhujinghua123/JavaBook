package chap03;

import java.util.Scanner;

public class Mooc3_1 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("please  input year:");
        year = sc.nextInt();
        if ((year % 4 == 0 && year != 100) || (year % 400 == 0)) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + "isn't leap year.");
        }
        sc.close();
    }

}
