import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("Kim", 20));
        people.add(new Person("Lee", 21));
        people.add(new Person("Kim", 20));
        people.add(new Person("Choi", 22));
        people.add(new Person("Park", 23));


        System.out.println(people);
    }
}
