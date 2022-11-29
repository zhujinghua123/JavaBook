package chap13;

public class homework10 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(1, 1);
        Rectangle r2 = new Rectangle(2, 3);
        Rectangle r3 = new Rectangle(3, 2);
        System.out.println("r1 equals r2 ? " + r1.equals(r2));
        System.out.println("r2 equals r3 ? " + r2.equals(r3));

    }


}
