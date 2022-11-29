package chap10;

public class Test10_3_MyInteger {
    // int��������
    static int value;

    // �вι��췽��
    public Test10_3_MyInteger(int num) {
        value = num;
    }

    // �ж�ָ��ֵ��int�ͣ�
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 == 1;
    }

    public static boolean isPrime(int num) {
        return havePrimeNumber(value);
    }

    // �ж�ָ��ֵ��MyInteger�ͣ�
    public static boolean isEven(Test10_3_MyInteger mi) {
        return mi.isEven(mi.value);
    }

    public static boolean isOdd(Test10_3_MyInteger mi) {
        return mi.isOdd(mi.value);
    }

    public static boolean isPrime(Test10_3_MyInteger mi) {
        return havePrimeNumber(mi.value);
    }

    // +: �ж�һ�����Ƿ�������
    public static boolean havePrimeNumber(int num) {
        boolean bool = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i != 0) {
                bool = false;
            }
        }
        return bool;
    }

    // �����ַ����ɵ�����תΪintֵ
    public static int parseInt(char[] arr) {
        int length = arr.length;
        String str = "";
        for (int i = 0; i < length; i++) {
            str += arr[i];
        }
        return parseInt(str);
    }

    // �ַ���תint
    public static int parseInt(String str) {
        int length = str.length(), result = 0;
        char temp;
        for (int i = 0; i < length; i++) {
            temp = str.charAt(i);
            result = result * 10 + temp - 48;
        }
        return result;
    }

    // ��ȡvalue
    public int getValue() {
        return value;
    }

    // �����������ж϶����е�ֵ
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        return havePrimeNumber(value);
    }

    // �ж�ֵ�Ƿ����
    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(Test10_3_MyInteger mi) {
        return this.value == mi.value;
    }
}

