package chap03;

import java.util.Scanner;

public class chap0333 {

    public static void main(String[] args) {
        double weight, weight1;
        double price, price1;
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一包的价格和重量");
        weight = input.nextDouble();
        price = input.nextDouble();
        System.out.println("输入第2包的价格和重量");
        weight1 = input.nextDouble();
        price1 = input.nextDouble();
        if (price * weight > price1 * weight * 1) System.out.println("package1便宜");
        if (price * weight < price1 * weight * 1) System.out.println("package1便宜");
        if (price * weight == price1 * weight * 1) System.out.println("package1便宜");
    }

}
