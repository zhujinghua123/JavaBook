package chap08;

import java.util.Scanner;

/**
 * @author: 洪洛安
 * @date: 2022年10月28日 下午8:54:56
 * @description:
 */
public class Homework19 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组行数、列数：");
        int array_row = input.nextInt();
        int array_col = input.nextInt();

        int[][] array = new int[array_row][array_col];

        System.out.println("请输入数组元素：");
        for (int i = 0; i < array_row; i++) {
            for (int j = 0; j < array_col; j++) {
                array[i][j] = input.nextInt();
            }
        }
        //4. 主方法：调用方法isConsecutiveFour，传入数组
        //5. 主方法：使用条件判断语句判断方法返回值，根据结果返回不同boolean值
        if (isConsecutiveFour(array)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isConsecutiveFour(int[][] values) {
        //6. 方法isConsecutiveFour：先获取values数组的行数、列数
        int row = values.length;
        int col = values[0].length;
        //7. 方法isConsecutiveFour：分别对数组的行、列进行遍历，寻找是否有重复元素；再对数组两条对角线进行遍历，看是否能找到
        // 行遍历：如果找到返回true
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - 3; j++) {
                if (values[i][j] == values[i][j + 1] && values[i][j + 1] == values[i][j + 2]
                        && values[i][j + 2] == values[i][j + 3])
                    return true;
            }
        }
        // 列遍历
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row - 3; i++) {
                if (values[i][j] == values[i + 1][j] && values[i + 1][j] == values[i + 2][j]
                        && values[i + 2][j] == values[i + 3][j])
                    return true;
            }
        }
        // 左下到右上的对角线
        for (int i = 3; i < row; i++) {
            for (int j = 0; j < col - 3; j++) {
                if (values[i][j] == values[i - 1][j + 1] && values[i - 1][j + 1] == values[i - 2][j + 2]
                        && values[i - 2][j + 2] == values[i - 3][j + 3])
                    return true;
            }
        }
        // 左上到右下的对角线
        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < col - 3; j++) {
                if (values[i][j] == values[i + 1][j + 1] && values[i + 1][j + 1] == values[i + 2][j + 2]
                        && values[i + 2][j + 2] == values[i + 3][j + 3])
                    return true;
            }
        }
        //8. 方法isConsecutiveFour：如果找到返回true，找不到返回false
        return false;
    }


}


