package chap11;

import java.util.ArrayList;

public class Test05 {
    ArrayList<String> students = new ArrayList<>();
    private String courseName;
    private int numberOfStudents;

    public Test05(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public void getStudents() {
        for (int i = 0; i < getSize(); i++)
            System.out.println(students.get(i));
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSize() {
        return students.size();
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}