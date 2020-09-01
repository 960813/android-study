public class VarEx {

    public static void main(String[] args) {
        // 기본형 변수: 실제 값이 들어간다.
        int a = 10;

        // 참조형 변수: 실제 값이 있는 곳을 가리키는 주소 값이 들어간다.
        // 참조형 변수의 종류: 배열, 클래스, 인터페이스
        int[] arr = {1, 2, 3};

        System.out.println("a : " + a);
        System.out.println("arr : " + arr);
        System.out.println("arr[0] : " + arr[0]);

        for (int i = 0; i < arr.length; ++i) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
