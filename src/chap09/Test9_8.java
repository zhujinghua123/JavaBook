package chap09;

public class Test9_8 {
    public static void main(String[] args) {
        Test8_Fan fan0 = new Test8_Fan();
        fan0.setSpeed(Test8_Fan.FAST);
        fan0.setradius(10);
        fan0.setColor("yellow");
        fan0.setOn(true);

        Test8_Fan fan1 = new Test8_Fan();
        fan1.setSpeed(Test8_Fan.MEDIUM);
        fan1.setradius(5);
        fan1.setColor("blue");
        fan1.setOn(false);

        System.out.println(fan0.toString());
        System.out.println(fan1.toString());
    }
}


