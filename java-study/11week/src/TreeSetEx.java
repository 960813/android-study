import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<String>();

        tset.add("KKK");
        tset.add("BBB");
        tset.add("AAA");
        tset.add("KKK");
        tset.add("PPP");

        System.out.println(tset);

    }
}
