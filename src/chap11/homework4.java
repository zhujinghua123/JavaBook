package chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class homework4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter numbers:");
        int n;

        while (true) {
            n = input.nextInt();
            if (n == 0)
                break;
            list.add(n);
        }


        int max = max(list);
        System.out.print("The max number:" + max);
    }

    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        if (list == null || list.isEmpty())
            return 0;
        for (Integer integer : list) {
            max = max > integer ? max : integer;
        }
        return max;
    }

}


