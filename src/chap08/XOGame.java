package chap08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description 8.9
 * @Author 住京华
 * @Date 2022/10/18-下午 05:12
 */
public class XOGame {
    private final int[][] X;//记录X子数据
    private final int[][] O;//记录O子数据

    public XOGame() {
        X = new int[3][3];
        O = new int[3][3];
        System.out.println("游戏开始");
        PrintChessBoard();
    }

    //打印棋盘
    private void PrintChessBoard() {
        for (int i = 0; i < 3; ++i) {
            System.out.print("|");
            for (int j = 0; j < 3; ++j) {
                if (X[i][j] == 1) {
                    System.out.print("X|");
                } else if (O[i][j] == 1) {
                    System.out.print("O|");
                } else System.out.print(" |");
            }
            System.out.println();
        }
    }

    //棋子输入
    private void Putin(int[][] arr, String name, int[][] temp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入" + name + "棋子坐标：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        //判断是否已经存在棋子
        if (arr[x][y] == 1 || temp[x][y] == 1) {
            System.out.println("该位置已经有棋子,请重新输入：");
            if (name.equals("X")) Putin(X, "X", O);
            if (name.equals("O")) Putin(O, "O", X);
        } else arr[x][y] = 1;
    }

    //判赢函数
    private boolean GameWin(int[][] arr) {
        Map<Integer, Integer> map = new HashMap<>();//行列对角线总和
        for (int i = 0; i < 3; ++i) {
            int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0;
            for (int j = 0; j < 3; ++j) {
                temp1 += arr[i][j];
                temp2 += arr[j][i];
                if (i == j) temp3 += arr[i][j];
                if (i + j == 2) temp4 += arr[i][j];
            }
            map.put(i, temp1);//行和
            map.put(i + 3, temp2);//列和
            map.put(i + 6, temp3);//主对角线和
            map.put(i + 9, temp4);//对角线和
        }
        return map.containsValue(3);
    }

    //开始游戏
    public void StartGame() {
        int count = 0;
        while (true) {
            Putin(X, "X", O);
            PrintChessBoard();
            if (GameWin(X)) {
                System.out.print("X胜利！");
                break;
            }
            if (++count == 9) {
                System.out.print("平局");
                break;
            }
            Putin(O, "O", X);
            PrintChessBoard();
            if (GameWin(O)) {
                System.out.print("O胜利！");
                break;
            }
            if (++count == 9) {
                System.out.print("平局");
                break;
            }
        }
    }

}
