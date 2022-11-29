package chap05;

import java.util.Scanner;

public class Homework45 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double input = 0, m = 0;
        double sum = 0;
        double s_sum = 0;

        for (int i = 1; i <= 10; i++) {
            input = scanner.nextDouble();
            m++;
            sum += input;
            s_sum += Math.pow(input, 2);
        }
        double mean = sum / m;
        double deviation = Math.sqrt((s_sum - Math.pow(sum, 2) / m) / (m - 1));
        System.out.println("The means is " + mean);
        System.out.printf("The standard deviation is %.5f", deviation);


    }

}
