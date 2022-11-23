package chap17.stu;

import java.io.*;
import java.util.ArrayList;

import static chap17.stu.UserControl.FILE_NAME;


/**
 * @Description 输入输出流
 * @Author 住京华
 * @Date 2022/11/22
 */
public class ObjectInOutputStream {
    public static ArrayList<Student> readFile() {
        ArrayList<Student> students = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ois = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0) {
                Student stuTemp;
                stuTemp = (Student) ois.readObject();
                students.add(stuTemp);
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static int writeFile(ArrayList<Student> studentArrayList) {
        int tag;
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            //append参数为true时从文件末尾写，否则覆写
            fos = new FileOutputStream(FILE_NAME, true);
            if (FILE_NAME.length() < 1) {
                oos = new ObjectOutputStream(fos);
            } else {
                oos = new MyObjectOutputStream(fos);
            }

            for (Student student : studentArrayList) {
                oos.writeObject(student);
            }
            tag = 1;
        }  catch (IOException e) {
            e.printStackTrace();
            tag = -1;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tag;
    }


}

class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected MyObjectOutputStream() throws IOException, SecurityException {
    }

    //重写方法，之后写入时不写入header
    @Override
    protected void writeStreamHeader() throws IOException {
        return;
    }
}
