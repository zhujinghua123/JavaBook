package chap05;

public class Test5_24 {
    public static void main(String[] args) {
        double formula = 0;
        for (int i = 99; i >= 3; i--) {
            formula += 1.0 / i;
        }
        formula = 49 - 2 * formula;
        System.out.println(formula);
    }
}
