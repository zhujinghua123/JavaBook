package chap06;

public class Test6_23 {

    public static void main(String[] args) {
        String b = "ccbbccab==c";
        char a = 'c';
        int t = charnum(b, a);
        System.out.print(t);
    }

    public static int charnum(String a, char b) {
        int len = a.length() - 1;
        int cishu = 0;
        for (int j = 0; j <= len; j++) {
            if (b == a.charAt(j)) {
                cishu++;
            }
        }
        return cishu;
    }

}
