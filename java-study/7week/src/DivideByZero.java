import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dividend;
        int divisor;
        while (true) {
            try {
                System.out.print("나늼수를 입력하세요 >> ");
                dividend = scan.nextInt();

                System.out.print("나눗수를 입력하세요 >> ");
                divisor = scan.nextInt();

                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " +
                        dividend / divisor + "입니다.");
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
            }
        }
        scan.close();
    }
}
