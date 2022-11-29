package chap05;

public class Homework40 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int people = 0;
        int flower = 0;
        for (int i = 1; i <= 1000000; i++) {
            int result = (int) (Math.random() * 2);
            if (result == 0) {
                flower++;
            } else {
                people++;
            }

        }
        System.out.printf("正面次数是: " + people + "反面次数是：" + flower);
    }

}
