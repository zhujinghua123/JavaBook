package chap11;

/**
 * @Description 11.2
 * @Author 住京华
 * @Date 2022/10/31-上午 12:12
 */
public class Student extends Person {
    static String dayi = "大一";
    static String daer = "大二";
    static String dasan = "大三";
    static String dasi = "大四";

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
