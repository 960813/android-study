import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = "->";
            else
                separator = "\n";
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("트랜스포머");
        strings.add("스타워즈");
        strings.add("매트릭스");
        strings.add(0, "터미네이터");
        strings.add(2, "아바타");

        Collections.sort(strings);
        printList(strings);

        Collections.reverse(strings);
        printList(strings);

        int index = Collections.binarySearch(strings, "아바타") + 1;
        System.out.println("아바타는 " + index + "번쨰 요소입니다.");
    }
}
