package chap10;

import java.math.BigInteger;

/**
 * @Description 10.19
 * @Author ס����
 * @Date 2022/11/20
 */
public class Mersenne {
    public static void main(String[] args) {
        // ��ȡС��100������������int���鼴�ɣ�
        int[] arr = new int[50];
        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i)) {
                arr[count] = i;
                count++;
            }
        }
        int[] arr1 = new int[count];
        for (int i = 0; i < count; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;
        // ���������ȡMersenne�����������������BigInteger������
        System.out.println("p\t2^p-1");
        BigInteger[] bi_arr = new BigInteger[count];
        double temp = 0;
        for (int i = 0; i < count; i++) {
            temp = Math.pow(2, arr[i]) - 1;
            if (isPrimeNumber(temp)) {
                BigInteger bit = new BigInteger(temp + "");
                bi_arr[i] = bit;
                System.out.printf("%d\t%d\n", arr[i], (int) temp);
            } else {
                bi_arr[i] = new BigInteger("-2");
            }
        }
        for (int i = 0; i < count; i++) {
            if (bi_arr[i].equals(new BigInteger("2"))) {
                for (int a = i; a < count; a++) {
                    bi_arr[a] = bi_arr[a + 1];
                }
            }
        }
    }

    public static boolean isPrimeNumber(double num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
