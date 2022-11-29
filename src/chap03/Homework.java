package chap03;

/**
 * @author: 洪洛安
 * @date: 2022年9月16日 下午9:54:26
 * @description:根据输入月份输出月份
 */
public class Homework {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12 + 1);

        switch (month) {
            case 1:
                System.out.println("一月");
                break;
            case 2:
                System.out.println("二月");
                break;
            case 3:
                System.out.println("三月");
                break;
            case 4:
                System.out.println("四月");
                break;
            case 5:
                System.out.println("五月");
                break;
            case 6:
                System.out.println("六月");
                break;
            case 7:
                System.out.println("七月");
                break;
            case 8:
                System.out.println("八月");
                break;
            case 9:
                System.out.println("九月");
                break;
            case 10:
                System.out.println("十月");
                break;
            case 11:
                System.out.println("十一月");
                break;
            default:
                System.out.println("十二月");
                break;

        }

    }


}

