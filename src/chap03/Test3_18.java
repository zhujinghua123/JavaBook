package chap03;

import java.util.Scanner;

/**
 * ����ɱ�
 */
public class Test3_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the weight of your package : ");
        int w = sc.nextInt();
        double p = 0;
        if (w > 20)
            System.out.println("the package cannot be shippes!");
        else if (w < 0)
            System.out.println("Invaild input");
        else if (w > 0 && w <= 1)
            p = 3.5;
        else if (w > 1 && w <= 3)
            p = 5.5;
        else if (w > 3 && w <= 10)
            p = 8.5;
        else if (w > 10 && w <= 20)
            p = 10.5;

        System.out.printf("transportation cost is %.2f", w * p);
        sc.close();
    }
}
