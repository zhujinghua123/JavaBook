package chap02;

import java.util.Scanner;

public class mooc2 {

    public static void main(String[] args) {

        String name;

        double time, reward, tax;

        Scanner scanner = new Scanner(System.in);

        name = scanner.next();

        time = scanner.nextDouble();

        reward = scanner.nextDouble();

        tax = scanner.nextDouble();

        double salary = time * reward * 22 * (1 - tax);

        System.out.printf("%s Salary is % 10.2f", name, salary);
        scanner.close();

    }

}


