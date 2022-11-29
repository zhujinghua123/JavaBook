package chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        System.out.print("Enter 5 numbers:");

        for (int i = 0; i < 5; i++)
            list.add(input.nextDouble());

        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double i : list)
            sum += i;
        return sum;
    }


}