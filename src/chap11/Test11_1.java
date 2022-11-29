package chap11;

import java.util.Arrays;
import java.util.Scanner;

public class Test11_1 {
    // ���Գ���
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("���������ߵ�ֵ��");
        int side1 = input.nextInt(), side2 = input.nextInt(), side3 = input.nextInt();
        System.out.print("������ɫ��");
        String color = input.next();
        System.out.print("�Ƿ���䣨booleanֵ����");
        boolean filled = input.nextBoolean();

        if (!isTriangle(side1, side2, side3)) {
            System.out.println("����������߲�����Ҫ��");
            System.exit(0);
        }

        Test11_1_Triangle myTri = new Test11_1_Triangle(side1, side2, side3);
        myTri.setColor(color);
        myTri.setFilled(filled);
        // ��ʾ������ܳ�����ɫ���Ƿ����
        System.out.println(myTri.getArea() + "\n" + myTri.getPerimeter() + "\n"
                + myTri.getColor() + "\n" + myTri.isFilled());

    }

    public static boolean isTriangle(double s1, double s2, double s3) {

        double[] arr = {s1, s2, s3};
        Arrays.sort(arr);
        boolean re1 = arr[0] + arr[1] > arr[2];
        boolean re2 = (s1 > 0) && (s2 > 0) && (s3 > 0);
        return re1 && re2;
    }
}

