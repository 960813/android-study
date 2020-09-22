public class StringEx {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Java";
        String c = "Hello";

        if (a.equals(c))
            System.out.println("a와 c는 같은 객체이다.");
        else
            System.out.println("a와 c는 다른 객체이다.");

        if (a == c)
            System.out.println("두 객체는 같은 주소값");
        System.out.println("========");

        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Java");

        if (e.equals(f))
            System.out.println("e와 f는 같은 객체");
        else
            System.out.println("e와 f는 다른 객체");

        if (e == f)
            System.out.println("e와 f는 같은 주소값");
        else
            System.out.println("e와 f는 다른 주소값");
    }
}
