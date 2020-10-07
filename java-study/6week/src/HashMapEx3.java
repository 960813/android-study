import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student {
    private int id;
    private String tel;

    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

public class HashMapEx3 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김남윤", new Student(3, "010-333-3333"));

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            Student student = map.get(name);
            System.out.println(name + ":" + student.getId() + ":" + student.getTel());
        }
    }
}
