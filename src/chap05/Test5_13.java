package chap05;

/**
 * ��n*n*n<12000���������n
 */
public class Test5_13 {
    public static void main(String[] args) {
        int n = 40;
        while (Math.pow(n, 3) >= 12000) {
            n--;
        }
        System.out.println(n);
    }
}

