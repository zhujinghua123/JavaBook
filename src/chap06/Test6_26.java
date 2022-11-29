package chap06;

public class Test6_26 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count <= 100; i++) {
            if (palindromeNumber(i) && primeNumber(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static boolean palindromeNumber(int i) {
        if (i / 10 == 0)
            return true;
        else if (i / 100 == 0)
            return (i / 10) == (i % 10);
        else if (i / 1000 == 0)
            return (i / 100) == (i % 10);
        else if (i / 10000 == 0)
            return ((i / 1000) == (i % 10)) && ((i % 1000 / 100) == (i % 100 / 10));
        else
            return ((i / 10000) == (i % 10)) && ((i % 10000 / 1000) == (i % 100 / 10));
    }

    public static boolean primeNumber(int i) {
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