package chap06;

import java.util.Scanner;

public class text_6_39 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // ��ȡ����������ֵ
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble(), y0 = input.nextDouble();
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // �����ĸ�����
        boolean bool1 = leftOfTheLine(x0, y0, x1, y1, x2, y2);
        boolean bool2 = rightOfTheLine(x0, y0, x1, y1, x2, y2);
        boolean bool3 = onTheSameLine(x0, y0, x1, y1, x2, y2);
        boolean bool4 = onTheLineSegment(x0, y0, x1, y1, x2, y2);

        // ���ݲ�ͬ������
        if (bool1) {
            System.out.println("(" + x2 + "," + y2 + ") is on the left side of the line");
            System.out.print("\tfrom (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }
        if (bool2) {
            System.out.println("(" + x2 + "," + y2 + ") is on the right side of the line");
            System.out.print("\tfrom (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }
        if (bool4) {
            System.out.print("(" + x2 + "," + y2 + ") is on the line segment from (" + x0 + "," + y0 + ") to (" +
                    x1 + "," + y1 + ")");
            return;
        }
        if (bool3)
            System.out.print("(" + x2 + "," + y2 + ") is on the same line from (" + x0 + "," + y0 + ") to (" +
                    x1 + "," + y1 + ")");
        input.close();
    }

    // �ж����
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    // �ж��Ҳ�
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (result < 0) {
            return true;
        } else {
            return false;
        }
    }

    // �ж��Ƿ���ֱ����
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    // �ж��Ƿ����߶���
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            if (x0 >= Math.min(x0, x1) && x0 <= Math.max(x0, x1) && y0 >= Math.min(y0, y1) && y0 <= Math.max(y0, y1))
                return true;
            return false;
        }
        return false;
    }
}

