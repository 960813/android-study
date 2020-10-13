public class MultiExceptionEx {
    public static void main(String[] args) {
        int num = 30;
        try {
            int num1 = Integer.parseInt(args[0]);
            System.out.println(num1);
            int n = num / 0;
            System.out.println("--------------");
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("입력한 데이터가 없습니다.");
        } catch (ArithmeticException e) {
            System.out.println("0이 아닌 수로 나누세요");
        } catch (Exception e) {
            System.out.println("또 다른 예외가 발생했습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
