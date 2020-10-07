import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Kim", 90);
        map.put("Lee", 87);
        map.put("Park", 95);
        map.put("Han", 79);
        map.put("Choi", 80);

        // Key는 Set 계열
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int score = map.get(name);
            System.out.println(name + ":" + score);
        }
    }
}
