package chap06;

/**
 * @author: 洪洛安
 * @date: 2022年9月21日 下午8:32:22
 * @description:
 */
public class Homework26 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 0;
        for (int i = 2; count <= 100; i++) {
            if (huiwen(i) && su_number(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static boolean huiwen(int i) {

        if (i / 10 == 0)
            return true;
        else if (i / 100 == 0)
            return (i / 10) == (i % 10);
        else if (i / 1000 == 0)
            return (i / 100) == (i % 10);
        else if (i / 10000 == 0)
            return ((i / 1000) == (i % 10)) && ((i % 1000 / 100) == (i % 100 / 10));
        else
            return ((i / 10000) == (i % 10)) && ((i % 10000 / 1000) == (i % 100 / 10));
    }

    public static boolean su_number(int i) {
        boolean bool = true;
        for (int n = 2; n <= Math.sqrt(i); n++) {
            if (i % n == 0) {
                bool = false;
                break;
            }
        }
        return bool;
    }


}


