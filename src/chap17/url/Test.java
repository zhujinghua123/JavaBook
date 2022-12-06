package chap17.url;

import java.util.Scanner;

/**
 * @Description 测试
 * @Author 住京华
 * @Date 2022/12/5
 */
public class Test {
    public static void main(String[] args) {
        
        WebURLTest webURLTest = new WebURLTest();
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入起始url以及篇数：");
        webURLTest.crawler(scanner.next(), scanner.nextInt());
        webURLTest.printRes();
        
    }
}
