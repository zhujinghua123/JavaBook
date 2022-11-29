package chap09;

public class Homework1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println(" 宽度:" + rectangle1.width + " 长度:" + rectangle1.height + " 面积:" +
                rectangle1.getArea() + " 周长:" + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println(" 宽度:" + rectangle2.width + " 长度:" + rectangle2.height + " 面积:" +
                rectangle2.getArea() + " 周长:" + rectangle2.getPerimeter());


    }

}

