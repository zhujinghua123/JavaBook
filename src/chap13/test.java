package chap13;

public class test {
    public static void main(String[] args) throws Exception {
        Octagon o = new Octagon(5);
        System.out.println(o.getArea());
        System.out.println(o.getPerimeter());
        Octagon a2 = (Octagon) o.clone();
        System.out.println(o.compareTo(a2));
    }
}