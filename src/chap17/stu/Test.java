package chap17.stu;

import java.util.Scanner;

/**
 * @Description 测试
 * @Author 住京华
 * @Date 2022/11/22
 */
public class Test {

    public static void main(String[] args) {
        UserControl userControl = new UserControl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            userControl.menu();
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> userControl.writeF();
                case 2 -> userControl.readF();
                case 3 -> userControl.averageAndMinmaxScore();
                case 4 -> userControl.clearFile();
                case 0 -> System.exit(0);
                default -> System.out.println("重新输入");
            }
        }
    }
}
