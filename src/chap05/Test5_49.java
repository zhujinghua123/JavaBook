package chap05;

import java.util.Scanner;

public class Test5_49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int temp = 0, vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) str.charAt(i);
            temp = (int) ch;

            if (temp >= 76 && temp <= 90)
                temp += 32;

            if (temp == 97 || temp == 101 || temp == 105 || temp == 111 || temp == 117)
                ++vowels;
            else if (temp >= 97 && temp <= 122)
                ++consonants;
        }


        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
