import java.util.HashSet;

public class HashSetEx {
    // Set: 중복 허용 X, 순서 X
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Kim");
        set.add("Lee");
        set.add("Park");
        set.add("Kim");

        System.out.println(set);
    }
}
