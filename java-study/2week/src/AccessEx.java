// 클래스에 생성자가 하나도 없으면 기본 생성자가 자동으로 추가된다.
// private은 클래스 내부에서만 접그 ㄴ가능
class Sample {
    // 일반적으로 필드는 private
    // 메소드는 public
    // default 접근 지정자는 같은 패키지에 있으면 접근 가능
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();

//        aClass.a = 10;
//        aClass.b = 20;
//        aClass.c = 30;
        aClass.setA(10);
        aClass.setB(20);
        aClass.setC(30);
        
        System.out.println(aClass.getA());
        System.out.println(aClass.getB());
        System.out.println(aClass.getC());
    }
}
