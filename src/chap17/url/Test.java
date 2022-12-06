package chap17.url;

/**
 * @Description 测试
 * @Author 住京华
 * @Date 2022/12/5
 */
public class Test {
    public static void main(String[] args) {
        
        WebURLTest webURLTest = new WebURLTest();
        webURLTest.crawler("http://news.jxu6*/6*6e.edu.cn/news-show-120596.html");
        webURLTest.printRes();
        
    }
}
