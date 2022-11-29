package chap05;

/**
 * @author: 洪洛安
 * @date: 2022年9月17日 下午3:06:49
 * @description: 将!和~对应的ASCII码值赋值给变量，利用强制转换输出
 */
public class Homework15 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int anumber1 = 33;
        int anumber2 = 126;
        int count = 0;
        for (int i = anumber1; i <= anumber2; i++) {
            System.out.print((char) i + " ");
            count++;
            if (count % 10 == 0)
                System.out.println();
        }
    }
}


