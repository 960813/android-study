class Test {
    public int a;

    public Test() {
        a = 10;
    }
}

class TestChild extends Test {
    public int a;

    public TestChild() {
        a = 20;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Test tc = new TestChild();
        System.out.println(tc.a);
    }
}
