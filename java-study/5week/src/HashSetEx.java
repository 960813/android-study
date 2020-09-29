import java.util.HashSet;

// Set: 데이터의 중복이 허용 안되고, 순서가 없음.
public class HashSetEx {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("Kim");
        set.add("Lee");
        set.add("Kim");
        set.add("Park");
        set.add("Choi");

        set.add(Integer.valueOf(10));
        set.add(123);
        set.add(12.5);
        set.add(10);

        System.out.println(set);

        System.out.println("================");

        // Raw Object가 아닌 Generic Object
        // Integer 타입의 데이터만 저장
        HashSet<Integer> intSet = new HashSet<Integer>();

    }
}
