package chap11;

import java.util.Date;

/**
 * @Description 11.01
 * @Author ������
 * @Date 2022/10/26-���� 03:55
 */

public class Test11_1_GeometricObject {
    String color;
    boolean filled;
    Date dateCreated;

    public Test11_1_GeometricObject() {
        dateCreated = new Date();
    }

    public Test11_1_GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Test01_GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}