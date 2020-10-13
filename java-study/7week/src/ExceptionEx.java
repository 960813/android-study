// 예외처리
public class ExceptionEx {
    public static void main(String[] args) {
        int[] arr = new int[2];

        try {
            arr[0] = 1;
            arr[1] = 2;
//            arr[2] = 3; // ArrayIndexOutOfBoundsException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 오류");
        }

        System.out.println("정상 종료");
    }
}
