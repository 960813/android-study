import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("KKK");
        strings.add("BBB");
        strings.add("PPP");
        strings.add("KKK");
        strings.add("AAA");

        System.out.println(strings);

        Collections.sort(strings);

        System.out.println(strings);
    }
}
