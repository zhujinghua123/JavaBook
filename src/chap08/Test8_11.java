package chap08;

import java.util.Scanner;

public class Test8_11 {
    public static void main(String[] args) {
        int user_input = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        user_input = input.nextInt();
        int[][] bin = new int[3][3];
        String[][] str = new String[3][3];
        bin = dec_to_bin(user_input);
        str = bin_to_state(bin);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] dec_to_bin(int num) {
        int[][] arr = new int[3][3];
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                arr[i][j] = (num % 2);
                num /= 2;
            }
        }
        return arr;
    }

    public static String[][] bin_to_state(int[][] arr) {
        String[][] str = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0) {
                    str[i][j] = "H";
                } else
                    str[i][j] = "T";
            }
        }
        return str;
    }
}
