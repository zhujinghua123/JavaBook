package chap05;

public class Test5_7 {
    public static void main(String[] args) {
        int free0 = 10000;
        double free10 = free0 * Math.pow((1 + 0.05), 10);
        System.out.println("第10年学费为：" + free10);

        double sum = 0;
        for (int i = 1; i < 5; i++) {
            sum += free10 * Math.pow((1 + 0.05), i);
        }
        System.out.println("第10年起4年内总学费为：" + sum);
    }
}
