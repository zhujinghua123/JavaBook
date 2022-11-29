package chap09;

/**
 * @Description 9.9
 * @Author 住京华
 * @Date 2022/10/17-上午 12:33
 */
public class regularPolygon {
    private int n;
    private int side;
    private double x, y;

    public regularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public regularPolygon(int n, int side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public regularPolygon(int n, int side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        regularPolygon one = new regularPolygon();
        System.out.println("The perimeter is " + one.getPerimeter() + " the area is " + one.getArea());
        regularPolygon two = new regularPolygon(6, 4);
        System.out.println("The perimeter is " + two.getPerimeter() + " the area is " + two.getArea());
        regularPolygon three = new regularPolygon(10, 4, 5.6, 7.8);
        System.out.print("The perimeter is " + three.getPerimeter() + " the area is " + three.getArea());
    }

    public double getPerimeter() {
        return getN() * getSide();
    }

    public double getArea() {
        return (getN() * Math.pow(getSide(), 2)) / (4 * Math.tan(Math.PI / getN()));
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
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
}
