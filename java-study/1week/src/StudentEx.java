class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentEx {
    public static void main(String[] args) {
        Student stu = new Student("Kim", 20);
        System.out.println("stu : " + stu);
    }
}
