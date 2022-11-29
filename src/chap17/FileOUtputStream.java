package chap17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static chap17.UserHandler.FILE_NAME;

/**
 * @Description ���ݷ���
 * @Author ס����
 * @Date 2022/11/21
 */
public class FileOUtputStream {
    public void Write() throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
            outputStream.write(s.getBytes());
        }
    }
}
