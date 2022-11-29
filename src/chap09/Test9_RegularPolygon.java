package chap09;

public class Test9_RegularPolygon {

    private int n = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;


    public Test9_RegularPolygon() {
    }

    public Test9_RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public Test9_RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // getter and setter

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // �����ܳ���getPerimeter����
    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

}
