package chap08;

import java.util.Scanner;

public class Test8_1 {
    public static void main(String[] args) {
        //1. 主方法：声明一个长度为3*4的double型矩阵
        double[][] m = new double[3][4];
        //2. 主方法：使用双层循环读取控制台输入为矩阵赋值
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 4; b++) {
                m[a][b] = input.nextDouble();
            }
        }
        //3. 主方法：创建一个int型对象columnIndex，赋值为0
        int columnIndex = 0;
        //4. 主方法：创建一个double对象，用于接收方法返回值
        double result = 0;
        //5. 主方法：循环表头，columnIndex从0开始到3结束
        for (columnIndex = 0; columnIndex < 4; columnIndex++) {
            //6. 主方法：调用sumColumn方法，传入矩阵和列数，使用刚刚创建的double对象接收返回值
            result = sumColumn(m, columnIndex);
            //7. 主方法：输出列和
            System.out.print("Sum of the elements at column " + columnIndex + " is " + result + "\n");
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        //8. sumColumn方法：创建一个int对象获取行数，double型对象保存加和
        int row = m.length;
        double sum = 0;
        //9. sumColumn方法：通过循环计算列和
        for (int i = 0; i < row; i++) {
            sum += m[i][columnIndex];
        }
        //10.sumColumn方法：返回列和
        return sum;
    }
}
