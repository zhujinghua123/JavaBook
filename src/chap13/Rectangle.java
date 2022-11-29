package chap13;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this(width, height, "white", false);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle r) {
        if (getArea() > r.getArea())
            return 1;
        else if (getArea() < r.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (compareTo((Rectangle) o) == 0)
            return true;
        else
            return false;
    }


}
