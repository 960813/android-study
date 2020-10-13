import java.io.*;

// C:\\Temp\\aaa.txt 파일을 현재 위치에 copy.txt 라는 이름으로 복사
// 바이트/문자
// 여기서는 예외를 처리하지 않고 전가
// Exception
//  ㄴ IOException
//       ㄴ FileNotFoundException
public class FileCopyEx {
    public static void main(String[] args) throws Exception {
        // 1. 적절한 장치를 연결한다. (스트림 선정)
        InputStream in = null;
        OutputStream out = null;

        in = new FileInputStream("C:\\Temp\\aaa.txt");
        out = new FileOutputStream("copy.txt");

        // 2. 읽고, 쓰기
        while (true) {
            int data = in.read();

            if (data == -1)
                break;

            out.write(data);
            System.out.print((char)data);
        }

        // 3. 스트림 닫기
        out.close();
        in.close();
    }
}
