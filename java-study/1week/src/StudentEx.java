// 1. 이 프로그램을 실행하면 오류가 발생한다. 해결 방법은?
class Student {
    // Field
    private String name;
    private int age;

    // 해결: 기본 생성자 추가
    public Student() {

    }

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentEx {
    public static void main(String[] args) {
        Student stu = new Student(); // 기본 생성자가 정의되지 않았는데 호출함.
        Student stu1 = new Student("홍길동", 24);
    }
}
