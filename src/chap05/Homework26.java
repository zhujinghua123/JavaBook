package chap05;

public class Homework26 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double e = 1, item = 1;
        for (int n = 1; n <= 20; n++) {
            item *= 1.0 / n;
            e += item;
            String result = String.format("%.16f", e);
            System.out.println("n=" + n + "时e为" + result);
        }


    }

}
