package chap05;

public class Test5_18 {
    public static void main(String[] args) {
        // 0：打印表头
        System.out.println("图案1           图案2           图案3           图案4");

        int lines = 6;
        for (int n = 1; n <= lines; n++) {

            for (int a = 1; a <= n; a++)
                System.out.printf("%d ", a);

            if (lines != n) {
                for (int b = lines - n; b > 0; b--)
                    System.out.print("  ");
            }


            System.out.print("    ");


            for (int c = 1; c < (lines - n + 2); c++) {
                System.out.printf("%d ", c);
            }

            if (n != 1) {
                for (int d = 1; d <= n - 1; d++)
                    System.out.print("  ");
            }

            System.out.print("    ");


            if (n != 6) {
                for (int e = 1; e < (lines - n + 1); e++)
                    System.out.print("  ");
            }

            for (int f = n; f > 0; f--)
                System.out.printf("%d ", f);

            System.out.print("    ");


            if (n != 1) {
                for (int g = 1; g < n; g++)
                    System.out.print("  ");
            }

            for (int h = 1; h < lines - n + 2; h++)
                System.out.printf("%d ", h);


            System.out.println();
        }
    }
}
