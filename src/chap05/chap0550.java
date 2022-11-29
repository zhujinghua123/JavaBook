package chap05;

import java.util.Scanner;

public class chap0550 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();      // nextLine()读1行，next()读空格后的元素（空格起止）

        // 2. 将字符串每一位单独提取并转为char，进而转为int以获取每个字符的ASCII码形式
        int temp = 0, upper = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) str.charAt(i);
            temp = (int) ch;
            //3. 判断temp是否在大写字母范围内
            if (temp >= 65 && temp <= 90)
                ++upper;
        }

        // 输出结果
        System.out.println("The number of uppercase letters is " + upper);

    }

}
