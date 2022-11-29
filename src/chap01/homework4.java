package chap01;

public class homework4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("a\ta^2\ta^3\t");
        int a = 1;
        for (int j = 1; j <= 4; j++) {
            int b = a * a;
            int c = a * a * a;
            System.out.println(a + "\t" + b + "\t" + c);
            a = a + 1;
            if (c != 0) {
                System.out.println();
            }

        }
    }

}
