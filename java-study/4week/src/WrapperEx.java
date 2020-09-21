public class WrapperEx {
    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A'));

        char c1 = '4', c2 = 'F';

        if (Character.isDigit(c1)) {
            System.out.println(c1 + "는 숫자");
        }

        if (Character.isAlphabetic(c2)) {
            System.out.println(c2 + "는 영문자");
        }

        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.toHexString(28));    // 16진수 문자열로 변환
        System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 변환
        System.out.println("정수의 최대값: " + Integer.MAX_VALUE);  // 2^31 -1
        System.out.println("정수의 최소값: " + Integer.MIN_VALUE);  // (-)2^31

        Double d = Double.valueOf(3.14);
        System.out.println(d.toString()); // double -> 객체 Double 타입으로 변환. boxing 없어도 됨.
        System.out.println(Double.parseDouble("3.14")); // 문자열(객체) -> double

        boolean b = 4 > 3;
        System.out.println(Boolean.toString(b)); // true -> 문자열(객체) "true"
        System.out.println(Boolean.parseBoolean("false"));
    }
}
