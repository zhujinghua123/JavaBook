package chap08;

import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int count = 0;
        int[] location = new int[2];
        for (int i = 0; i < 6; i++) {
            count = 0;
            for (int j = 0; j < 6; j++) {
                if (array[i][j] == 1) {
                    ++count;
                }
            }
            if (count % 2 == 1) {
                location[0] = i;
                break;
            }
        }
        for (int j = 0; j < 6; j++) {
            count = 0;
            for (int i = 0; i < 6; i++) {
                if (array[i][j] == 1) {
                    ++count;
                }
            }
            if (count % 2 == 1) {
                location[1] = j;
                break;
            }
        }
        // 输出结果
        System.out.println("The flipped cell is at (" + location[0] + ", " + location[1] + ")");
    }
}