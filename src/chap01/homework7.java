package chap01;

public class homework7 {
    public static double draw(int num) {

        double a = 0.0;
        int i = 1;
        for (int j = 1; j <= num; j += 2) {
            if (i % 2 == 0) {
                a -= (1.0 / j);
            } else if (i % 2 != 0) {
                a += (1.0 / j);
            }
            i++;
        }
        return (4.0 * a);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double result1 = draw(11);
        double result2 = draw(13);
        System.out.println("4*(1-1/3+1/5-1/7+1/9-1/11)=" + result1);
        System.out.println("4*(1-1/3+1/5-1/7+1/9-1/11+1/13)=" + result2);
    }

}
