import java.util.ArrayList;

public class ArrayListEx {
    // List: 중복 허용 O, 순서 O
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Kim");
        list.add("Lee");
        list.add("Park");
        list.add("Kim");

        System.out.println(list);
    }
}
