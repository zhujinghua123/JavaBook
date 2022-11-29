package chap09;

public class Test9_9 {

    public static void main(String[] args) {
        Test9_RegularPolygon rp0 = new Test9_RegularPolygon();
        Test9_RegularPolygon rp1 = new Test9_RegularPolygon(6, 4);
        Test9_RegularPolygon rp2 = new Test9_RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("��һ�������ܳ��������%.2f %.2f\n", rp0.getPerimeter(), rp0.getArea());
        System.out.printf("�ڶ��������ܳ��������%.2f %.2f\n", rp1.getPerimeter(), rp1.getArea());
        System.out.printf("�����������ܳ��������%.2f %.2f\n", rp2.getPerimeter(), rp2.getArea());
    }
}


