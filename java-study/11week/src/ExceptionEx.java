public class ExceptionEx {
    public static void main(String[] args) {
        int[] arr = new int[3];


        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;


            arr[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과");
        } finally {
            System.out.println("정상 종료");
        }
    }
}
