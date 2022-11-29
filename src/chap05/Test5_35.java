package chap05;

/**
 * ���
 */
public class Test5_35 {

    public static void main(String[] args) {
        double temp = 0, a = 0;
        for (int n = 1; n <= 624; n++) {
            temp = 1 / (Math.sqrt(n) + Math.sqrt(n + 1));
            a = a + temp;
        }
        System.out.printf("%.2f", a);
    }

}
