package chap05;

/**
 * ��Ӣ����ǧ��֮�以��
 */
public class Test5_6 {

    public static void main(String[] args) {
        System.out.println("Ӣ��    ǧ��  |  ǧ��    Ӣ��");

        double temp = 1.609;
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d    %.3f  |  %d    %.3f\n", i, (i * temp),
                    (5 * i + 15), ((5 * i + 15) / temp));
        }
    }
}
