// NullPointerException : 실제 객체가 없는데 접근할 경우 발생
public class NullEx {
    public static void main(String[] args) {
        String str1 = "AAAAA";
        String str2 = null; // 변수가 가리키는 객체가 없음

        System.out.println(str1);
        System.out.println(str2);

        // 객체를 동작시킨다.
        System.out.println(str1.charAt(0));
        System.out.println(str2.charAt(0));
    }
}
