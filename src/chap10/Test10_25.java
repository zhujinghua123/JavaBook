package chap10;

public class Test10_25 {
    public static String[] split(String s, String regex) {
        int s_len = s.length();
        int regex_len = regex.length();

        int count = 1;
        for (int a = 0; a < s_len; a++) {
            for (int b = 0; b < regex_len; b++) {
                if (s.charAt(a) == regex.charAt(b)) {
                    count += 2;
                }
            }
        }

        String[] feedback = new String[count];
        String temp = "";
        String temp_regex = "";
        int count_temp;
        for (int index = 0; index < count - 1; ) {
            for (int a = 0; a < s_len; a++) {
                count_temp = 0;
                for (int b = 0; b < regex_len; b++) {
                    if (s.charAt(a) != regex.charAt(b))
                        count_temp++;
                    else
                        temp_regex = regex.charAt(b) + "";
                }
                if (count_temp == regex_len) {
                    temp += s.charAt(a);
                } else {
                    feedback[index] = temp;
                    temp = "";
                    index++;
                    feedback[index] = temp_regex;
                    index++;
                }
                if (a == (s_len - 1)) {
                    feedback[index] = temp;
                }
            }
        }
        return feedback;
    }

    public static void main(String[] args) {
        String[] str1 = split("ab#12#453", "#");
        String[] str2 = split("a?b?gf#e", "[?#]");

        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i] + " ");
        }
    }
}
