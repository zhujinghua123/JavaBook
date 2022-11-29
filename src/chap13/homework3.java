package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 numbers:");

        for (int i = 0; i < 5; i++)
            list.add(input.nextInt());

        Collections.sort(list);

        for (int i : list)
            System.out.print(i + " ");
    }

}
