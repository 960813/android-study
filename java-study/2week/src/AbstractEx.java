// 추상 클래스
// 객체 생성 불가능
abstract class AA {
    private int x;

    public abstract void doA(); // 추상 메소드
}

class BB extends AA {

    @Override
    public void doA() {
        System.out.println("BB doA()");
    }

    public void doB() {
        System.out.println("BB doB()");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        // AA ap = new AA();
        BB bp = new BB();
        bp.doA();

        // 다형성
        AA aap = new BB();
        aap.doA();  // BB 클래스의 doA 실행

        // 형변환
        BB bbp = (BB)aap;
        bbp.doB();
    }
}
