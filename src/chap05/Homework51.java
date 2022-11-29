package chap05;

import java.util.Scanner;

public class Homework51 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("enter the second string: ");
        String s2 = scanner.nextLine();
        String s3 = input_str(s1, s2);
        System.out.print("the common prefix is " + s3);

    }

    public static String input_str(String s1, String s2) {

        int a = s1.length();
        int b = s2.length();
        int c;
        if (a >= b) {
            c = b;
        } else c = a;
        char[] j = new char[c];
        for (int i = 0; i < c; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                j[i] = s1.charAt(i);
            }
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
        }

        String str = String.valueOf(j);
        return str;

    }


}
