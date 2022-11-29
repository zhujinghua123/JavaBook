package chap05;

import java.util.Scanner;

/**
 * ��ӡ���ֽ�����
 */
public class Test5_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ��1��15֮������� : ");
        int l = sc.nextInt();

        for (int n = 1; n <= l; n++) {
            if (n != l) {
                for (int a = 1; a <= l - n; a++)
                    System.out.printf("  ");
            }
            for (int b = n; b > 0; b--) {
                System.out.printf("%d ", b);
            }
            if (n >= 2) {
                for (int c = 2; c <= n; c++)
                    System.out.printf("%d ", c);
            }

            System.out.println();
        }
        sc.close();
    }

}

