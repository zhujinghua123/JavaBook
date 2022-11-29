package chap06;

public class Test6_29 {
    public static void main(String[] args) {
        for (int a = 2; a <= 997; a++) {
            if (isPrimeNumber(a) && isPrimeNumber(a + 2)) {
                System.out.println("(" + a + "," + (a + 2) + ")");
            }
        }
    }

    public static boolean isPrimeNumber(int i) {
        if (i == 1) {
            return false;
        }
        for (int n = 2; n <= i / 2; n++) {
            if (i % n == 0)
                return false;
        }
        return true;
    }
}