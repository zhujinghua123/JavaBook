package chap06;

public class chap0626 {

    public static boolean issushu(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean ishuiwen(int n) {
        String s = String.valueOf(n);
        int low = 0;
        int heigh = s.length() - 1;
        while (low < heigh) {
            if (s.charAt(low) != s.charAt(heigh)) {
                return false;  // 不是回文
            }
            low++;
            heigh--;
        }
        return true;
    }

    public static void main(String[] args) {
        int cnt1 = 0, cnt2 = 0, i = 0;
        while (cnt2 < 100) {
            if (ishuiwen(i) == true) {
                if (issushu(i) == true) {
                    System.out.print(i + "\t");
                    cnt1++;
                    cnt2++;
                }
                if (cnt1 == 10) {
                    System.out.print("\n");
                    cnt1 = 0;
                }
            }
            i++;
        }
    }
}

