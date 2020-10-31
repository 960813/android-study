import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("person1.txt");
        ObjectInputStream ois = new ObjectInputStream(in);

        ArrayList<Person> people = (ArrayList<Person>) ois.readObject();
        System.out.println(people);

        ois.close();
        in.close();

    }
}
