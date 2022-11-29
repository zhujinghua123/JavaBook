package chap11;

import java.util.Date;

/**
 * @Description 11.2
 * @Author 住京华
 * @Date 2022/10/31-上午 12:13
 */
public class Faculty extends Employee {
    Date time;
    int level;

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}
