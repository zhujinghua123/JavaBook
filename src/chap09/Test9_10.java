package chap09;

import java.util.Scanner;

public class Test9_10 {


    public static void main(String[] args) {
        // �û�����
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

        // ��������+���ù��췽��
        Test10_QuadraticEquation qe = new Test10_QuadraticEquation(a, b, c);

        // ��ȡ�б�ʽ���
        double judge = qe.getDiscriminant();

        if (judge > 1) {
            System.out.printf("%.3f %.3f\n", qe.getRoot1(), qe.getRoot2());
        } else if (judge < 0.0001 && judge > -0.0001) {
            System.out.printf("%.3f\n", qe.getRoot1());
        } else {
            System.out.printf("The equation has no roots");
        }
        input.close();
    }
}
