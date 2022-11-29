package chap11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description 11.14
 * @Author ������
 * @Date 2022/10/26-���� 05:01
 */
public class Test11_14 {

    public static void main(String[] args) {
        System.out.print("Enter 5 integers for list1: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int n1 = input.nextInt();
            list1.add(n1);
        }
        System.out.print("Enter 5 integers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int n2 = input.nextInt();
            list2.add(n2);
        }
        ArrayList<Integer> list = union(list1, list2);
        System.out.print("The combined list is ");
        for (int i : list)
            System.out.print(i + " ");
        input.close();
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }
}
