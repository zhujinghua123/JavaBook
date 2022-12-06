package chap17.url;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description web
 * @Author 住京华
 * @Date 2022/12/5
 */
public class WebURLTest {
    //待爬取list
    List<String> waitURL = new ArrayList<>();
    //已爬取list
    List<String> edURL = new ArrayList<>();
    //得到的数据
    List<NewsData> dataList = new ArrayList<>();
    
    public void crawler(String startURL) {
        // 将起始Url放入待爬取列表
        waitURL.add(startURL);
        // 循环爬取
        while (!waitURL.isEmpty() && edURL.size() <= 10) {
            //从待爬取列表中取出一个Url
            String urlString = waitURL.remove(0);
            // 判断该Url是否已爬取过
            if (!edURL.contains(urlString)) {
                edURL.add(urlString);
                String context = crawlData(urlString);
                NewsData newsDataTemp = extraData(context);
                newsDataTemp.data = extraArticle(context);
                dataList.add(newsDataTemp);
                waitURL.add(extraUrl(context));
            }
        }
    }
    
    public String crawlData(String urlString) {
        var stringBuilder = new StringBuilder();
        try {
            URL url = new URL(urlString);
            try (var input = new Scanner(url.openStream())) {
                while (input.hasNext()) {
                    String line = input.nextLine();
                    stringBuilder.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
    
    public NewsData extraData(String context) {
        NewsData newsData = new NewsData();
        Pattern patternTitle = Pattern.compile("(<title>)(.*?)(</title>)");
        Pattern patternTime = Pattern.compile("(<span>日期：)(.*?)(</span>)");
        Matcher matcherTitle = patternTitle.matcher(context);
        Matcher matcherTime = patternTime.matcher(context);
        while (matcherTitle.find()) {
            newsData.title = matcherTitle.group(2);
        }
        while (matcherTime.find()) {
            newsData.time = matcherTime.group(2);
        }
        return newsData;
    }
    
    public String extraUrl(String context) {
        String res = "";
        Pattern patternUrl = Pattern.compile("(<div class=\"related_articles syp\" style=\"margin-top: 20px;\">\n" +
                " {28}<a href=\")(.*?)(\" class=\"syp1\" style=\"display:block;\">)");
        Matcher matcherUrl = patternUrl.matcher(context);
        while (matcherUrl.find()) {
            res = matcherUrl.group(2);
        }
        return res;
    }
    
    public String extraArticle(String context) {
        String startTag = "<div class=\"v_news_content\">\n" +
                "                                ";
        String endTag = "</div>";
        int startIndex = context.indexOf(startTag) + startTag.length();
        int endIndex = context.indexOf(endTag, startIndex);
        String needStr = context.substring(startIndex, endIndex);
        Pattern patternP = Pattern.compile("(<p>)(.*?)(</p>)");
        Pattern patternSpan = Pattern.compile("(<span)(.*?)(>)(.*?)(</span>)");
        Matcher matcherP = patternP.matcher(needStr);
        Matcher matcherSpan = patternSpan.matcher(needStr);
        String temp;
        var strRes = new StringBuffer();
        if (needStr.contains("<span>")) {
            while (matcherSpan.find()) {
                temp = matcherSpan.group(4);
                if (!temp.contains("<span style=\"font-family:arial, helvetica, sans-serif;\">") && !temp.contains(
                        "<span style=\"font-family:楷体, 楷体_gb2312, simkai;\">") && !temp.contains("<br>")) {
                    strRes.append(matcherSpan.group(4));
                }
            }
        } else {
            while (matcherP.find()) {
                temp = matcherP.group(2);
                if (!temp.contains("<br>") && !temp.contains("<span style=\"font-family:arial, helvetica, sans-serif;" +
                        "\">") && !temp.contains("<span style=\"font-family:楷体, 楷体_gb2312, simkai;\">")) {
                    strRes.append(temp);
                }
            
            }
        }
        deleteStr(strRes, "<span>");
        deleteStr(strRes, "&nbsp;");
        deleteStr(strRes, "<strong>");
        deleteStr(strRes, "</strong>");
        return strRes.toString();
    }
    
    public void deleteStr(StringBuffer stringBuffer, String str) {
        int index = stringBuffer.indexOf(str);
        while (index != -1) {
            if (Objects.equals(str, "&nbsp;")) {
                stringBuffer.replace(index, index + str.length(), " ");
            } else {
                stringBuffer.replace(index, index + str.length(), "");
            }
            index = stringBuffer.indexOf(str);
        }
    }
    
    public void printRes() {
        for (NewsData newsData : dataList) {
            System.out.println("日期：" + newsData.time + "  标题：" + newsData.title + "  文章：" + newsData.data);
        }
    }
}
