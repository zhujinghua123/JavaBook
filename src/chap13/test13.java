package chap13;

public class test13 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1 = new Course("");
        for (int i = 0; i < 10; ++i)
            c1.addStudent(i + "");
        System.out.println(c1.getNumberOfStudents());
        Course c2 = (Course) c1.clone();
        c2.addStudent("sad");
        System.out.println(c2.getNumberOfStudents());
        String[] s = c2.getStudents();
        System.out.print("c2: ");
        for (int i = 0; i < 11; i++)
            System.out.print(s[i] + " ");
    }
}