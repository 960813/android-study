import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();

        strings.add("Kim");
        strings.add("Lee");
        strings.add("Kim");
        strings.add("Choi");
        strings.add("Park");

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
