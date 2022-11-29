package chap05;
/**
 * ��ת�ַ���
 */

import java.util.Scanner;

public class Test5_46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("The reveresd string is ");
        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));

        sc.close();
    }
}
