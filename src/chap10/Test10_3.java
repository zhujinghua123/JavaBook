package chap10;

public class Test10_3 {
    public static void main(String[] args) {
        Test10_3_MyInteger mi = new Test10_3_MyInteger(1);

        System.out.println(mi.getValue());

        System.out.println(mi.isEven() + " " + mi.isOdd() + " " + mi.isPrime());

        System.out.println(Test10_3_MyInteger.isEven(2) + " " + Test10_3_MyInteger.isOdd(2) +
                " " + Test10_3_MyInteger.isPrime(2));

        Test10_3_MyInteger mi_pro = new Test10_3_MyInteger(2);
        System.out.println(Test10_3_MyInteger.isEven(mi_pro) + " " + Test10_3_MyInteger.isOdd(mi_pro) +
                " " + Test10_3_MyInteger.isPrime(mi_pro));

        char[] ch = {'1', '2', '3'};
        System.out.println(Test10_3_MyInteger.parseInt(ch));

        String str = "1210_3";
        System.out.print(Test10_3_MyInteger.parseInt(str));
    }
}

