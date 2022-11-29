package chap09;

public class Test10_QuadraticEquation {
    private double a, b, c;

    // ���췽��
    public Test10_QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getter����
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // getDiscriminant����
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // ��ȡ����
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
