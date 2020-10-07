import java.util.Iterator;
import java.util.TreeSet;

// String 클래스는 이미 정렬 기능을 갖도록 Comparable Interface가 구현되어 있다.
// 하지만 내가 만든 클래스로 생성한 객체가 정렬 기능을 가지려면....
// Comparable 인터페이스를 구현해줘야 한다.

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();

        tree.add("BBB");
        tree.add("KKK");
        tree.add("AAA");
        tree.add("ZZZ");
        tree.add("PPP");

        // 자동적으로 오름차순 정렬 됨: String 클래스가 Comparable 를 구현해뒀기 때문
        System.out.println(tree);

        Iterator<String> it = tree.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
