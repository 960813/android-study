import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Kim");
        set.add("Lee");
        set.add("Kim");
        set.add("Park");

        for (int i = 0; i < set.size(); ++i) {
            Object[] str = set.toArray();
            System.out.println(str[i]);
        }

        System.out.println("====================");

        Vector<String> v = new Vector<String>();

        v.add("Kim");
        v.add("Lee");
        v.add("Kim");
        v.add("Park");

        for (int i = 0; i < v.size(); ++i) {
            Object obj = v.elementAt(i);
            System.out.println(obj);
        }

        System.out.println("====================");
        System.out.println("Iterator 사용");
        System.out.println("====================");
        Iterator iteratorHashSet = set.iterator();
        while (iteratorHashSet.hasNext()) {
            System.out.println(iteratorHashSet.next());
        }
        System.out.println("====================");
        Iterator iteratorVector = v.iterator();
        while (iteratorVector.hasNext()) {
            System.out.println(iteratorVector.next());
        }

    }
}
