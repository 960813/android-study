import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Temp\\aaa1.txt"); // 13바이트
        FileOutputStream fos = new FileOutputStream("aaa2.txt");

        byte[] buffer = new byte[5];

        while (true) {
            // 버퍼 단위로 읽기
            int count = fis.read(buffer);
            if (count == -1)
                break;

//            fos.write(buffer);
            fos.write(buffer, 0, count);
        }
        fis.close();
        fos.close();
    }
}
