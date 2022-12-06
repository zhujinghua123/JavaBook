package chap17.url;

/**
 * @Description 数据
 * @Author 住京华
 * @Date 2022/12/5
 */
public class NewsData {
    //标题
    public String title;
    //文章
    public String data;
    //日期
    public String time;
    
    @Override
    public String toString() {
        return "日期：" + time + " 标题：" + title + " 文章：" + data + "\n";
    }
    
}
