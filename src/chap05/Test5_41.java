package chap05;

import java.util.Scanner;

public class Test5_41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers:");


        int user_input = 0, temp = 0, count_max = 1;

        for (; ; ) {

            user_input = input.nextInt();
            if (user_input == 0)
                break;


            if (temp > user_input) {
                //
            } else if (temp == user_input) {
                count_max++;
            } else {
                temp = user_input;
                count_max = 1;
            }
        }


        System.out.println("The largest number is " + temp);
        System.out.println("The occurrence count of the largest number is " + count_max);
    }
}
