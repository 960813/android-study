// 1. 이 프로그램을 실행하면 오류가 발생한다. 해결 방법은?
// 클래스에 생성자가 하나도 없으면 기본 생성자는 JVM이 자동으로 넣어준다.
// 클래스를 만들때 기본 생성자를 만들어 주는 습관을 가지는 것이 좋다.
// 생성자 역할: 객체 생성시 초기화
/*
자료형 비교
1. 기본 자료형: ==
2. 참조 자료형: equals() 메소드
    > Object equals()는 객체의 주소 값을 비교 -> return (this==obj)
 */
class Student {
    // Field
    String name;
    private int age;

    // 해결: 기본 생성자 추가
    public Student() {

    }

    // Constructor
    // this: 객체 자기 자신을 지칭
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 객체 정보를 문자열로 표현
    // Object 클래스의 toString() 메소드 오버라이딩
    public String toString() {
        return name + ":" + age;
    }

    // Object 클래스의 equals() 메소드 오버라이딩
    public boolean equals(Student stu) {
        return this.name.equals(stu.name) && this.age == stu.age;
    }
}

public class StudentEx {
    public static void main(String[] args) {
        Student stu = new Student(); // 기본 생성자가 정의되지 않았는데 호출함.
        Student stu1 = new Student("홍길동", 24);

        System.out.println("stu : " + stu);
        System.out.println("stu1 : " + stu1);

        Student stu2 = new Student("손흥민", 26);
        System.out.println("stu2 : " + stu2);

        Student stu3 = new Student("홍길동", 24);

        System.out.println(stu1.equals(stu3));
        System.out.println(stu1.equals(stu2));
        
        System.out.println(stu1.name);
    }
}
