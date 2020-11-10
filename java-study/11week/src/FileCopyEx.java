import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopyEx {
    public static void main(String[] args) throws Exception {
        // 1. 적절한 스트림을 결정
//        InputStream in = null;
//        OutputStream out = null;

        // Stream - Byte Data 처리
        // FileInput / FileOutput - . . .

//        in = new FileInputStream("C:\\Temp\\aaa.txt");
//        out = new FileOutputStream("copy.txt");

//        in = new FileInputStream("C:\\Temp\\aaa1.txt");
//        out = new FileOutputStream("copy1.txt");

        Reader in = null;
        Writer out = null;
        in = new FileReader("C:\\Temp\\aaa.txt");
        out = new FileWriter("aaa2.txt");

        // 2. 읽고/쓰기
        while (true) {
            int data = in.read();

            if (data == -1)
                break;

            out.write(data);
            System.out.print((char)data);
        }

        // 3. 닫기
        in.close();
        out.close();
    }
}
