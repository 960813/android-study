public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i + 1] = i + 1 + arr[i]; // Array Bounds = 0~4
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다.");
        }
    }
}
