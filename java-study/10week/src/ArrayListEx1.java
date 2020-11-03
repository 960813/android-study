import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("Kim", 20));
        list.add(new Person("Lee", 21));
        list.add(new Person("Park", 20));
        list.add(new Person("Kim", 20));

        System.out.println(list);

        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
