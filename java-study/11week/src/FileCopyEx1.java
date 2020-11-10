import java.io.*;

public class FileCopyEx1 {
    public static void main(String[] args) {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\Temp\\aaa.txt");
            out = new FileWriter("copy2.txt");

            while (true) {
                int data = in.read();

                if (data == -1) break;

                out.write(data);
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("IO 예외 발생");
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
