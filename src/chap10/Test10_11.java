package chap10;

public class Test10_11 {
    public static void main(String[] args) {
        Test10_11_Circle2D c1 = new Test10_11_Circle2D(2, 2, 5.5);
        System.out.printf("面积：%.2f\n", c1.getArea());
        System.out.printf("周长：%.2f\n", c1.getPerimeter());
        System.out.println("====================");
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Test10_11_Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Test10_11_Circle2D(3, 5, 2.3)));
    }
}

