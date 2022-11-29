package chap13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @Description 13.4
 * @Author 住京华
 * @Date 2022/11/7-下午 05:14
 */
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The year:");
        int year = input.nextInt();
        System.out.print("The month:");
        int month = input.nextInt();
        Calendar a = new GregorianCalendar(year, month - 1, 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int m = a.get(Calendar.DATE);
        a.roll(Calendar.DATE, 1);
        int n = a.get(Calendar.DAY_OF_WEEK);
        System.out.println("Sun Mon Tue Wed Thu Fir Sat");
        int i = 1;
        while (i < n) {
            System.out.print("\t");
            i++;
        }
        for (i = 1; i <= m; i++) {
            if ((n - 1 + i) % 7 == 0)
                System.out.println(i + "\t");
            else
                System.out.print(i + "\t");
        }

    }
}
