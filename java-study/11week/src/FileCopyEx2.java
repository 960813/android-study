import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx2 {
    public static void main(String[] args) throws Exception {
        InputStream in = null;
        OutputStream out = null;

        byte[] buffer = new byte[5];

        in = new FileInputStream("C:\\Temp\\aaa2.txt");
        out = new FileOutputStream("copy3.txt");

        while (true) {
            int count = in.read(buffer);

            if (count == -1)
                break;

            out.write(buffer, 0, count);
        }

        in.close();
        out.close();
    }
}
