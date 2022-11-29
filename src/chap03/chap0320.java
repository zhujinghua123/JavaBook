package chap03;

public class chap0320 {
    public static void main(String[] args) {
        System.out.println("10000以内的素数有：");
        int t = 0;
        for (int i = 1; i <= 10000; i++) {

            if (i == 2) {
                System.out.print(i + " ");
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    System.out.print(i + " ");
                    t++;
                }
            }

            if (t == 8) {
                System.out.println(" ");
                t = 0;
            }
        }

    }
}
