package chap11;

/**
 * @Description 11.2
 * @Author 住京华
 * @Date 2022/10/25-下午 02:12
 */
public class Person {
    String name = "测试";
    String Address;
    int number;
    String email;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
