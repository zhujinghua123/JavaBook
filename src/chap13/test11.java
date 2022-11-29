package chap13;

abstract class test11 {
    String color = "white";
    boolean filled;
    java.util.Date dateCreated;

    public test11() {
        dateCreated = new java.util.Date();
    }

    public test11(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Octagon extends test11 implements Comparable, Cloneable {
    double side = 0;

    public Octagon(double side) {
        this.side = side;
    }

    public double setSide() {
        return side;
    }

    public double getArea() {
        return side * side * (2 + 4 / Math.sqrt(2));
    }

    public double getPerimeter() {
        return side * 8;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int compareTo(Object o) {
        if (getArea() > ((Octagon) o).getArea())
            return 1;
        else if (getArea() < ((Octagon) o).getArea())
            return -1;
        else
            return 0;
    }
}
