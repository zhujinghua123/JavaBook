package chap05;

public class chap0524 {

    public static void main(String[] args) {
        double e = 1;
        double sum = 1;
        double t = 1;
        for (int i = 1; i < 100000; i++) {
            sum *= i;
            t = 1 / sum;
            e += t;
            if (i % 1000 == 0) {
                System.out.println(e);
            }
        }
    }
}

