package chap11;

public class Test11_1_Triangle extends Test11_1_GeometricObject {
    /**
     * @Description 11.01
     * @Author ������
     * @Date 2022/10/26-���� 04:12
     */

    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;

    public Test11_1_Triangle() {
    }

    public Test11_1_Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // ���������������getArea()
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    // �����������ܳ�
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // ���ظ������ε��ַ�������
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side = " + side3;
    }

    public void setColor(String color) {
        // TODO �Զ����ɵķ������

    }
}
