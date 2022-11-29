package chap05;

public class chap0512 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 20000) {
            if (i * i > 12000) {
                System.out.print(i);
                break;
            }
            i++;
        }

    }

}
