package chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList();

        System.out.println("请输入一个整数:");
        Integer m = scanner.nextInt();
        Integer M = m;

        for (int i = 2; i <= m; ) {
            if (m % i == 0) {
                list.add(i);
                m /= i;
            } else {
                i++;
            }
        }


        int sum = 1;

        int count;

        for (int i = 0; i < list.size(); i += count) {
            count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                sum *= list.get(i);
            }
        }
        System.out.println("使得m*n为完全平方的最小的整数n:" + sum);
        int ans = m * sum;
        System.out.println("m*n:" + M * sum);
    }

}