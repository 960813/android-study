import java.util.Calendar;

// 2020년 12월 25일까지 몇일 남았는가?
public class CalendarEx3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        long today = cal.getTimeInMillis(); // 1970년 1월 1일 부터 현재까지 흐른 ms

        // 2020년 12월 25일로 날짜 세팅
//        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DATE, 25);

        long xmas = cal.getTimeInMillis();

        long gap = xmas - today;

        System.out.println(1000 * 60 * 60 * 24); // 하루에 해당하는 long 시간
        System.out.println(gap / (1000 * 60 * 60 * 24));
        System.out.println(gap / 1000 / 60 / 60 / 24);
    }
}
