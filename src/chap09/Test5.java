package chap09;

import java.util.GregorianCalendar;

public class Test5 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.print(gc.get(GregorianCalendar.YEAR) + "年");
        System.out.print(gc.get(GregorianCalendar.MONTH) + "月");
        System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH) + "日");

        gc.setTimeInMillis(1234567898765L);
        System.out.print(gc.get(GregorianCalendar.YEAR) + "年");
        System.out.print(gc.get(GregorianCalendar.MONTH) + "月");
        System.out.print(gc.get(GregorianCalendar.DAY_OF_MONTH) + "日");
    }
}
