package chap05;

public class chap0526 {
    public static void main(String[] args) {
        int i = 10000;
        int count = 0;
        while (i >= 1) {
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    count += j;
                }
            }
            if (count == i) System.out.println(i);
            count = 0;
            i--;
        }
    }


}


