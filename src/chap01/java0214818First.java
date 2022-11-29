package chap01;

/**
 * @Author 住京华
 * @Description 9月5作业
 * @Date 2022/9/5-下午 8:12
 */
public class java0214818First {
    //1.4
    static void problem4() {
        System.out.println("a   a^2   a^3");
        for (int i = 1; i < 5; i++) {
            System.out.println(i + "   " + (int) Math.pow(i, 2) + "   " + (int) Math.pow(i, 3));
        }
    }

    //1.7
    static void problem7() {
        double a = 1.0, b = 1.0;
        for (int i = 2; i < 12; i++) {
            a += Math.pow(-1, i - 1) / (2 * i - 1);
        }
        System.out.println(4 * a);
        for (int i = 2; i < 14; i++) {
            b += Math.pow(-1, i - 1) / (2 * i - 1);
        }
        System.out.println(4 * b);
    }

    //1.11
    static void problem11() {
        int people = 312032486;
        double sec = 31536000.0;
        for (int i = 1; i < 6; i++) {
            people += sec / 7 - sec / 13 + sec / 45;
            System.out.printf("第%d年：%d\n", i, people);
        }
    }

    //1.13
    static void problem13() {
        double A = 3.4, B = 50.2, C = 2.1, D = 0.55, E = 44.5, F = 5.9;
        double x = (E * D - B * F) / (A * D - B * C), y = (A * F - E * C) / (A * D - B * C);
        System.out.println("X=" + x);
        System.out.print("Y=" + y);
    }

    public static void main(String[] args) {
        problem4();
        problem7();
        problem11();
        problem13();
    }
}
