package chap11;

import java.util.ArrayList;

/**
 * @Description 11.18
 * @Author 住京华
 * @Date 2022/10/25-下午 02:35
 */
public class toCharacter {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i) {
            list.add(s.charAt(i));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.print(toCharacterArray("abc"));
    }
}
