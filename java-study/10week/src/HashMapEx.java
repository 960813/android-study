import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
    public static void main(String[] args) {
        // Map: Key 중복 X / Value 중복 O / 순서 X
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Kim");
        map.put(2, "Lee");
        map.put(3, "Kim");
        map.put(2, "Park");

        System.out.println(map);


        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer k = iterator.next();
            String v = map.get(k);
            System.out.println(k + ":" + v);
        }
    }
}
