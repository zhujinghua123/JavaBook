package chap10;

public class Test10_1 {

    long hour, minute, second;

    public Test10_1() {
        long[] arr = millis_to_hms(System.currentTimeMillis());
        hour = arr[0];
        minute = arr[1];
        second = arr[2];
    }

    public Test10_1(Long l) {
        long[] arr = millis_to_hms(l);
        hour = arr[0];
        minute = arr[1];
        second = arr[2];
    }

    public Test10_1(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long[] arr = new long[3];
        arr = millis_to_hms(elapseTime);
        hour += arr[0];
        minute += arr[1];
        second += arr[2];
    }

    public long[] millis_to_hms(long l) {
        long[] feedback = new long[3];
        feedback[2] = l / 1000 % 60;
        feedback[1] = l / 1000 / 60 % 60;
        feedback[0] = l / 1000 / 60 / 60 % 24;
        return feedback;
    }
}
