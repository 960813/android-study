import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
    public static void main(String[] args) throws  Exception{
        InputStream in = new FileInputStream("person.txt");
        ObjectInputStream ois = new ObjectInputStream(in);

        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        Person p3 = (Person) ois.readObject();

        System.out.println("p1 : " + p1);
        System.out.println("p2 : " + p2);
        System.out.println("p3 : " + p3);

        ois.close();
    }
}
