package chap11;

import java.util.Date;

/**
 * @Description 11.2
 * @Author 住京华
 * @Date 2022/10/31-上午 12:12
 */
public class Employee extends Person {
    String office;
    Date worktime;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

}
