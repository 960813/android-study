import java.util.HashSet;
import java.util.Objects;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

//    public boolean equals(Student stu) {
//        return this.name.equals(stu.name) && this.age == stu.age;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

// Hash XXX 클래스에 저장하는 데이터는 equals() 메소드뿐 만 아니라
// hashCode() 메소드도 오버라이딩 해주어야 정상적으로 작동한다.
public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("Kim", 20));
        set.add(new Student("Lee", 22));
        set.add(new Student("Kim", 20)); // 중복
        set.add(new Student("Park", 22));

        System.out.println(set);

        Student stu1 = new Student("Moon", 22);
        Student stu2 = new Student("Kim", 22);
        Student stu3 = new Student("Kim", 22);

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
        System.out.println(stu3.hashCode());
    }
}
