abstract class AAA {
    {
        System.out.println("AAA");
    }

    int x = 10;

    public void doA() {
        System.out.println("AAA doA()");
    }

    public abstract void doB(); // 추상 메소드
}

public class BBB extends AAA {
    {
        System.out.println("BBB");
    }

    int x = 100;
    int y = 200;

    // 부모 클래스의 추상 메소드는 자식 클래스에서 반드시 오버라이딩
    @Override
    public void doB() {
        System.out.println("x1 : " + super.x);
        System.out.println("x2 : " + this.x);
        System.out.println("x3 : " + x);
    }

    public void doC() {
        System.out.println("CCC");
    }

    public static void main(String[] args) {
        BBB bp = new BBB();
        // AAA ap = new AAA(); // 추상 클래스는 단독으로 객체를 생성할 수 없다.
        bp.doB();

        AAA aap = new BBB();
        // aap.doC(); // 부모 클래스에 없는 메소드이기에 수행할 수 없다.

        BBB bbp = (BBB) aap; // 형변환
        bbp.doC();

        // bp 객체가 접근할 수 있는 멤버의 수
        // 참고로 Object 클래스는 9개를 가지고 있다.
        // BBB: 4개, AAA: 3개,
        // Object(9개) + BBB(4개) + AAA(중복 제외 1개) = 14개
    }
}
