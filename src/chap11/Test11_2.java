package chap11;

/**
 * @Description 测试类
 * @Author 住京华
 * @Date 2022/10/31-上午 12:28
 */
public class Test11_2 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        Student student = new Student();
        System.out.println(student.toString());
        Employee employee = new Employee();
        System.out.println(employee.toString());
        Faculty faculty = new Faculty();
        System.out.println(faculty.toString());
        Staff staff = new Staff();
        System.out.println(staff.toString());
    }

}
