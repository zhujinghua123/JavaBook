package chap17.stu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description 业务处理
 * @Author 住京华
 * @Date 2022/11/22
 */
public class UserControl {
    //文件名
    static File FILE_NAME = new File("D:\\桌面\\student.txt");
    //临时变量数组
    public ArrayList<Student> students;

    public ArrayList<Student> inputStudent() {
        students = new ArrayList<>();
        System.out.print("输入要储存学生的个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; ++i) {
            System.out.print("输入第" + (i + 1) + "个学生：");
            Student studentTemp = new Student();
            studentTemp.setName(scanner.next());
            studentTemp.setScore(scanner.nextFloat());
            students.add(studentTemp);
        }
        return students;
    }

    public void averageAndMinmaxScore() {
        float res = 0;
        for (Student student : students) {
            res += student.getScore();
        }
        System.out.println("平均分：" + res / students.size());
        System.out.println("最高分：" + students.get(0).getScore() + " 最低分：" +
                students.get(students.size() - 1).getScore());
    }

    public void printResult(int tag) {
        switch (tag) {
            case 1 -> System.out.println("信息输入成功");
            case -1 -> System.out.println("写入失败");
            default -> throw new IllegalArgumentException("异常" + tag);
        }
    }

    public void writeF() {
        printResult(ObjectInOutputStream.writeFile(inputStudent()));
    }

    public void readF() {
        students = new ArrayList<>();
        students = ObjectInOutputStream.readFile();
        students.sort((o1, o2) -> {
            if (o1.getScore() > o2.getScore()) {
                return -1;
            } else if (o1.getScore() < o2.getScore()) {
                return 1;
            }
            return 0;
        });
        System.out.println(students);
    }

    public void clearFile() {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            fileWriter.write("");
            fileWriter.flush();
            System.out.println("清除成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void menu() {
        System.out.println("1.录入学生数据");
        System.out.println("2.查看学生数据");
        System.out.println("3.输出得分信息");
        System.out.println("4.清除学生数据");
        System.out.println("0.退出");
    }

}
