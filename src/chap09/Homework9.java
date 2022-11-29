package chap09;

public class Homework9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        regularPolygon r0 = new regularPolygon();
        regularPolygon r1 = new regularPolygon(6, 4);
        regularPolygon r2 = new regularPolygon(10, 4, 5.6, 7.8);
        System.out.println("周长为:" + r0.getPerimeter() + " 面积为:" + r0.getArea());
        System.out.println("周长为:" + r1.getPerimeter() + " 面积为:" + r1.getArea());
        System.out.println("周长为:" + r2.getPerimeter() + " 面积为:" + r2.getArea());
    }

}

class RegularPolygon {
    private int n = 3;
    private double side = 1.0;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int n, int side) {
        this.n = n;
        this.side = side;


    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

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


    public double getPerimeter() {
        return n * side;
    }


    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

}