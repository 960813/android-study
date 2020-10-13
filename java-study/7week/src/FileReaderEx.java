import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

// 문자 데이터(한글)
public class FileReaderEx {
    public static void main(String[] args) throws Exception {
        // 1. 적절한 스트림을 선정
//        FileReader fr = new FileReader("C:\\Temp\\aaa.txt");
        Reader fr = new FileReader("C:\\Temp\\aaa.txt"); // 다형성
        FileWriter fw = new FileWriter("copy1.txt");

        // 2. 읽고/쓰기
        while (true) {
            int data = fr.read();

            if (data == -1)
                break;

            fw.write(data);
            System.out.print((char) data);
        }

        // 3. 닫기
        fr.close();
        fw.close();
    }
}
