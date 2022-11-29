package chap05;
/**
 * �������ϵ�ṹ�����ؼ��Ĳ���
 */

import java.util.Scanner;

public class Test5_44 {
    public static void main(String[] args) {
        // ��ȡ�û�����
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short value = sc.nextShort();

        // ת��
        int mask = 1;
        System.out.print("The 16 bits are ");
        for (int i = 15; i >= 0; i--) {
            int temp = value >> i;
            int bit = temp & mask;
            System.out.print(bit);
            sc.close();
        }
    }
}

