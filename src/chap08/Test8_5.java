package chap08;
/*������������������ӣ���д����������ӵķ�������дһ�����Գ�����ʾ�û���������3*3�ľ���Ȼ����ʾ���ǵĺ�*/

import java.util.Scanner;

public class Test8_5 {
    public static void main(String[] args) {

        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c = new double[3][3];
        //����һ�����鸳ֵ
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                a[row][col] = input.nextDouble();
            }
        }
        //���ڶ������鸳ֵ
        System.out.print("Enter matrix2: ");
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[0].length; col++) {
                b[row][col] = input.nextDouble();
            }
        }
        //�����������飬�õ�����������շ���ֵ
        c = addMatrix(a, b);

        System.out.println("The matrices are added as follows");

        for (int row = 0; row < 3; row++) {
            //��ӡ����aԪ��
            for (int col = 0; col < 3; col++) {
                System.out.print(a[row][col] + " ");
            }
            //��ӡ����a������b֮��Ŀո���+
            if (row != 1) {
                System.out.print("     ");
            } else {
                System.out.print("  +  ");
            }
            //��ӡ����b
            for (int col = 0; col < 3; col++) {
                System.out.print(b[row][col] + " ");
            }
            //��ӡ����b������c֮��Ŀո��=
            if (row != 1) {
                System.out.print("     ");
            } else {
                System.out.print("  =  ");
            }
            for (int col = 0; col < 3; col++) {
                System.out.print(c[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {

        double[][] c = new double[a.length][a[0].length];
        // ʹ��˫��ѭ�����������a��b�������飬������Ӧλ�õ�Ԫ����Ӳ���ֵ���ո�����������
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[0].length; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
        }

        return c;
    }
}

