import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Temp\\20201029-DSC00984.jpg");
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        // 버퍼 단위 읽기
        byte[] buffer = new byte[1024];

        long start = System.currentTimeMillis();

        while (true) {
            int count = fis.read(buffer);

            if (count == -1)
                break;

            fos.write(buffer, 0, count);
        }

        long end = System.currentTimeMillis();
        System.out.println("파일 복사 시간 : " + (end - start));
        fis.close();
        fos.close();
    }
}
