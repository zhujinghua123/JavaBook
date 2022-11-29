package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description 11.16
 * @Author 住京华
 * @Date 2022/10/25-下午 02:42
 */
public class PlusTest {
    Map<Integer, Integer> map = new HashMap<>();
    int i = 0;

    public static void main(String[] args) {
        System.out.print("What is 5+9?");
        PlusTest test = new PlusTest();
        test.plus();
    }

    public void plus() {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (!map.containsValue(temp)) {
            map.put(i++, temp);
        } else {
            System.out.println("You are already entered" + temp);
            plus();
        }
        if (temp == 14) {
            System.out.print("You got it");
            System.exit(0);
        } else {
            System.out.println("Wrong answer,try again");
            plus();
        }
    }
}
