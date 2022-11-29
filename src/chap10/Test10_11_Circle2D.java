package chap10;

public class Test10_11_Circle2D {
    double x, y;
    double radius;

    public Test10_11_Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Test10_11_Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        boolean b;
        if (distance >= radius)
            b = false;
        else
            b = true;
        return b;
    }

    public boolean contains(Test10_11_Circle2D circle) {
        // ��1��circleԲ���ڱ�Բ��
        // ��2��Բ�ľ���+circle�뾶 <= ��Բ�뾶
        boolean judgeStepOne, judgeStepTwo;
        double distance = Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y));
        judgeStepOne = contains(circle.x, circle.y);
        judgeStepTwo = (distance + circle.radius <= radius);
        return judgeStepOne && judgeStepTwo;
    }

    public boolean overlaps(Test10_11_Circle2D circle) {
        // Բ�ľ���С�����뾶��
        double distance = Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y));
        return distance < radius + circle.radius;
    }
}

