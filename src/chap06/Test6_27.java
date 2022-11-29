package chap06;

public class Test6_27 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; count <= 100; i++) {
            if (isPrimeNumber(i) && isPrimeNumber(reverse(i)) && (i != reverse(i))) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static int reverse(int i) {

        String str0 = i + "", str1 = "";
        int length = str0.length();
        for (int n = length - 1; n >= 0; n--) {
            str1 += str0.charAt(n);
        }

        return Integer.parseInt(str1);
    }

    public static boolean isPrimeNumber(int i) {
        boolean bool = true;
        for (int n = 2; n <= i / 2; n++) {
            if (i % n == 0) {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
