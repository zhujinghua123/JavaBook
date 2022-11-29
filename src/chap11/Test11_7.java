package chap11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description 11.07
 * @Author ������
 * @Date 2022/11/02-���� 02:01
 */
public class Test11_7 {
    public static void main(String[] args) {
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        shuffle(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
        System.out.println(list);
    }
}
