import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        System.out.println(myList);
        System.out.println();

        // 데이터를 일관된 방법으로 가져오기
        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("==오름차순 정렬하기==");
        Collections.sort(myList);
        System.out.println(myList);
        System.out.println();

        System.out.println("==내림차순 정렬하기==");
        Collections.reverse(myList);
        System.out.println(myList);
        System.out.println();

        System.out.println("==아바타 위치 찾기==");
        int index = Collections.binarySearch(myList, "아바타");
        System.out.println("아바타는 " + (index + 1) + "번째 입니다");
    }
}
