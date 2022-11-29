package chap06;

public class Text6_9 {

    {

    }

    public static void main(String[] args) {
        System.out.println("feet" + "\t" + "Meters" + "\t" + "|" + "\t" + "meter" + "\t" + "feet" + "\t");
        for (int i = 1; i <= 10; i++) {
            footToMeter(i);
            metertofoot(i);
        }

    }

    public static void footToMeter(double foot) {
        System.out.print(foot + "\t");
        System.out.print(foot * 0.305 + "\t" + "|" + "\t");
    }

    public static void metertofoot(double meter) {
        System.out.print(meter + "\t");
        System.out.println(meter * 3.279 + "\t");
    }
}
