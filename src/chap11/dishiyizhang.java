package chap11;

import java.util.ArrayList;
import java.util.Scanner;


public class dishiyizhang {
    public static void main(String[] args) {
        System.out.print("Enter 5 strings: ");
        Scanner input = new Scanner(System.in);
        MyStack m = new MyStack();
        for (int i = 0; i < 5; i++) {
            String str = input.next();
            m.push(str);
        }
        while (!m.isEmpty())
            System.out.println(m.pop());
    }
}

class MyStack extends ArrayList {
    public void push(Object o) {
        super.add(o);
    }

    public Object pop() {
        Object o = super.get(size() - 1);
        super.remove(size() - 1);
        return o;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }
}
