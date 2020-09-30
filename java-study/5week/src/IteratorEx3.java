import java.util.Iterator;
import java.util.TreeSet;

// TreeSet: 정렬 기능을 갖는 Set 자료구조
public class IteratorEx3 {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();

        tset.add("aaaa");
        tset.add("kkkk");
        tset.add("zzzz");
        tset.add("cccc");

        // Iterator 인터페이스만 구하면 자료구조에 무관하게 일관된 방법으로 데이털르 읽을 수 있다.
        Iterator<String> iterator = tset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
