package chap11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11_13 {

    public static void main(String[] args) {
        System.out.print("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = input.nextInt();
            list.add(n);
        }
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        input.close();
        for (Integer integer : list)
            System.out.print(integer + " ");
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        int n1 = 0;
        while (n1 < list.size()) {
            int n2 = list.get(n1);
            if (list.indexOf(n2) != n1)
                list.remove(n1);
            else
                n1++;
        }
    }
}
//    34 5 3 5 6 4 33 2 2 4