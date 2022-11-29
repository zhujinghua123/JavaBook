package chap09;

public class Test8_Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    String color = "blue";
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;

    // getter and setter

    public Test8_Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return speed + " " + color + " " + radius;
        } else {
            return "fan is off";
        }
    }
}