import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2Ex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(4);
        list.add(-1);
        list.add(2, 100);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            System.out.println(n);
        }

        // Iterator를 이용하여 모든 정수 더하기
        int sum = 0;
        iterator = list.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            sum += n;
        }

        System.out.println("ArrayList에 있는 정수의 합: " + sum);
    }
}
