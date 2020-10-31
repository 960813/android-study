import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("person1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(out);

        Person p1 = new Person("Kim", 20, "1111-1111");
        Person p2 = new Person("Lee", 21, "2222-2222");
        Person p3 = new Person("Park", 22, "3333-3333");
        Person p4 = new Person("Choi", 20, "4444-4444");

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        oos.writeObject(people);
        System.out.println(people);

        out.close();
        oos.close();
    }
}
