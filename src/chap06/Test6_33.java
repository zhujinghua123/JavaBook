package chap06;

public class Test6_33 {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();


        long currentMilliseconds = totalMilliseconds % 1000;
        long totalSeconds = totalMilliseconds / 1000;


        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;


        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long totalDays = totalHours / 24;


        long leapYearsDay = 366, normalYearsDay = 365;
        int years = 1970;
        for (; totalDays >= 0; years++) {
            if (isLeapYear(years))
                totalDays -= leapYearsDay;
            else
                totalDays -= normalYearsDay;
        }
        int currentYears = years - 1;

        boolean bool = isLeapYear(currentYears);
        if (bool) {
            totalDays += 367;
        } else {
            totalDays += 366;
        }


        int currentMonths = 0;
        String month_str = "";
        if (totalDays <= 31) {
            currentMonths = 1;
            month_str = "Jan";
        } else if (totalDays <= 59) {
            currentMonths = 2;
            totalDays -= 31;
            month_str = "Feb";
        } else if (totalDays <= 90) {
            currentMonths = 3;
            totalDays -= 59;
            month_str = "Mar";
        } else if (totalDays <= 120) {
            currentMonths = 4;
            totalDays -= 90;
            month_str = "Apr";
        } else if (totalDays <= 151) {
            currentMonths = 5;
            totalDays -= 120;
            month_str = "May";
        } else if (totalDays <= 181) {
            currentMonths = 6;
            totalDays -= 151;
            month_str = "Jun";
        } else if (totalDays <= 212) {
            currentMonths = 7;
            totalDays -= 181;
            month_str = "Jul";
        } else if (totalDays <= 243) {
            currentMonths = 8;
            totalDays -= 212;
            month_str = "Aug";
        } else if (totalDays <= 273) {
            currentMonths = 9;
            totalDays -= 243;
            month_str = "Sep";
        } else if (totalDays <= 304) {
            currentMonths = 10;
            totalDays -= 273;
            month_str = "Oct";
        } else if (totalDays <= 334) {
            currentMonths = 11;
            totalDays -= 304;
            month_str = "Nov";
        } else {
            currentMonths = 12;
            totalDays -= 334;
            month_str = "Dec";
        }
        if (bool && currentMonths > 1)
            totalDays -= 1;


        System.out.println("Current date and time is " + month_str + " " + totalDays + ", " +
                currentYears + " " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }
}
