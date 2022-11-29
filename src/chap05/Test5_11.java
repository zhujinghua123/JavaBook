package chap05;

public class Test5_11 {
    public static void main(String[] args) {

        boolean bool = false;
        int n = 0;
        for (int i = 100; i < 1001; ++i) {

            bool = false;
            if (((i % 5 == 0) && (i % 6 != 0)) || ((i % 5 != 0) && (i % 6 == 0))) {
                bool = true;
            }

            if (bool) {
                System.out.print(i + " ");
                ++n;
            }

            if (n == 10) {
                System.out.println();
                n = 0;
            }
        }
    }
}

