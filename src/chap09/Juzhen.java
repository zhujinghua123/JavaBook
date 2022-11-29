package chap09;

import java.util.Scanner;

public class Juzhen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("�������A��������");
        int x = input.nextInt();
        System.out.println("�������A��������B����������");
        int y = input.nextInt();
        System.out.println("�������B��������");
        int z = input.nextInt();
        //�ö�λ����洢����
        int[][] a = new int[x][y];
        int[][] b = new int[y][z];
        int[][] c = new int[x][z];
        System.out.println("����A����");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("����B����");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = input.nextInt();
            }
        }

        //���ݹ���������forѭ��ʵ�־������
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < b[j].length; k++) {
                    c[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        //��������������̨
        System.out.println("�����");
        for (int[] row : c) {
            for (int cloumn : row) {
                System.out.print(cloumn + "\t");
            }
            System.out.println();
        }

    }

}
