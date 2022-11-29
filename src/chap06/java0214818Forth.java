package chap06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description 9月21日作业
 * @Author 住京华
 * @Date 2022/9/21-下午 11:23
 */
public class java0214818Forth {
    public static double CtoF(double c) {
        return (9.0 / 5) * c + 32;
    }

    public static double FtoC(double F) {
        return (5.0 / 9) * (F - 32);
    }

    //6.8
    static void test6_8() {
        System.out.printf("%-10s%-10s%-10s%-10s\n", "摄氏度", "华氏度", "华氏度", "摄氏度");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f%-10.1f%-10.1f%-10.2f\n", 40.0 - i, CtoF(40 - i),
                    120.0 - i * 10, FtoC(120 - i * 10));
        }
    }

    //6.7
    public static double futurevalue(double m, double r, int y) {
        return m * Math.pow((1 + r / 100 / 12), y * 12);
    }

    static void test6_7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the money:");
        double m = sc.nextDouble();
        System.out.print("Enter the rate:");
        double r = sc.nextDouble();
        System.out.printf("%-10s%-10s\n", "Years", "Future value");
        for (int i = 1; i < 31; i++) {
            System.out.printf("%-10d%-15.2f\n", i, futurevalue(m, r, i));
        }
    }

    //6.17
    public static void matrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double tmp = Math.random();
                if (tmp > 0.5) {
                    System.out.printf("%-3d", 0);
                }
                if (tmp < 0.5) {
                    System.out.printf("%-3d", 1);
                }
            }
            System.out.println();
        }
    }

    static void test6_17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        matrix(sc.nextInt());
    }

    //6.31
    public static boolean isValid(long number) {
        return (getSize(number) >= 13) && (getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 6) || prefixMatched(number, 37)) &&
                (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int tmp = 0;
        number = number / 10;
        while (number != 0) {
            tmp += getDigit((int) ((number % 10) * 2));
            number = number / 100;
        }

        return tmp;
    }

    public static int getDigit(int number) {
        return number % 10 + (number / 10);
    }

    public static int sumOfOddPlace(long number) {
        int result = 0;
        while (number != 0) {
            result += (int) (number % 10);
            number = number / 100;
        }
        return result;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        int i = 0;
        while (d != 0) {
            i++;
            d = d / 10;
        }
        return i;
    }

    public static long getPrefix(long number, int k) {
        long result = number;

        for (int i = 0; i < getSize(number) - k; i++)
            result /= 10;

        return result;
    }

    static void test6_31() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        long num = sc.nextLong();
        System.out.println(isValid(num));
    }

    //6.26
    public static boolean isP(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static boolean huiwen(int x) {
        int tmp = x;
        int result = 0;
        while (tmp != 0) {
            int t = tmp % 10;
            result = result * 10 + t;
            tmp /= 10;
        }
        return result == x;
    }

    static void test6_26() {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 2; count < 100; i++) {
            if (huiwen(i) && isP(i)) {
                arr.add(i);
                count++;
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.printf("%-8d", arr.get(i));
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

    }

    public static void main(String[] args) {
        //test6_8();
        test6_7();
        test6_17();
        test6_31();
        test6_26();

    }
}
