package chap03;

import java.util.Scanner;

public class Test3_17 {
    public static void main(String[] args) {

        int computer = (int) (Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.println("rock(0), scissor(1), paper(2): ");
        int people = input.nextInt();


        if (people != 0 && people != 1 && people != 2) {
            System.out.println("输入不合法");
            System.exit(1);
        }


        if (computer == 0 && people == 0)
            System.out.println("The computer is rock. You are rock too. It is a draw");
        if (computer == 0 && people == 1)
            System.out.println("The computer is rock. You are scissor. Computer won");
        if (computer == 0 && people == 2)
            System.out.println("The computer is rock. You are paper. You won");

        if (computer == 1 && people == 0)
            System.out.println("The computer is scissor. You are rock. You won");
        if (computer == 1 && people == 1)
            System.out.println("The computer is scissor. You are scissor too. It is a draw");
        if (computer == 1 && people == 2)
            System.out.println("The computer is scissor. You are paper. Computer won");

        if (computer == 2 && people == 0)
            System.out.println("The computer is paper. You are rock. Computer won");
        if (computer == 2 && people == 1)
            System.out.println("The computer is paper. You are scissor. You won");
        if (computer == 2 && people == 2)
            System.out.println("The computer is paper. You are paper too. It is a draw");
    }
}
