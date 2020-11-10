import java.io.*;

public class DataInputStreamEx {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeInt(23);
        dos.writeDouble(12.34);
        dos.writeBytes("ABCDEFG!!");

        dos.close();
        bos.close();
        fos.close();

        // 읽기
        FileInputStream fis = new FileInputStream("data.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);

        int a = 0;
        double b = 0.0;
        byte[] c = null;

        a = dis.readInt();
        b = dis.readDouble();
        c = new byte[10];
        dis.read(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(new String(c));

        dis.close();
        bis.close();
        fis.close();
    }
}
