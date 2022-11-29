package chap06;

import java.util.Scanner;

public class Homework21 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("enter a string:");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        int l = result.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            count = getNumber(result.charAt(i));//得到数字
            if (count != -1)
                System.out.print(count);
            else
                System.out.print(result.charAt(i));
        }
    }


    public static int getNumber(char uppercaseLetter) {
        int str = (int) uppercaseLetter;
        if (str >= 48 && str <= 57) {          //ascii码
            return (str - 48);
        }
        if (str >= 97 && str <= 122) {
            str = str - 32;
        }
        if (str < 65 || str > 90) {
            return -1;
        }
        str -= 64;
        switch (str) {
            case 1:
            case 2:
            case 3:
                return 2;

            case 4:
            case 5:
            case 6:
                return 3;

            case 7:
            case 8:
            case 9:
                return 4;

            case 10:
            case 11:
            case 12:
                return 5;

            case 13:
            case 14:
            case 15:
                return 6;

            case 16:
            case 17:
            case 18:
            case 19:
                return 7;

            case 20:
            case 21:
            case 22:
                return 8;
            default:
                return 9;

        }

    }
}