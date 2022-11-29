package chap13;

import java.util.ArrayList;

/**
 * @Description 13.8
 * @Author 住京华
 * @Date 2022/11/14-9:45
 */
public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public MyStack() {

    }

    public MyStack(ArrayList<Object> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        MyStack myStack1 = new MyStack(myStack.list);
    }
}


