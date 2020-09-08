public class Circle {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public Circle() {
        radius = 1;
        name = "";
    } // 원의 생성자 (기본)

    public Circle(int r, String n) { // 매개 변수를 가지는 생성자
        radius = r;
        name = n;
    }

    public double getArea() { // 원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }
}
