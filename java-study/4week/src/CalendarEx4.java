import java.util.Calendar;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        long today = cal.getTimeInMillis();

        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.MONTH, 7);
        cal.set(Calendar.DATE, 13);

        long birthday = cal.getTimeInMillis();

        long gap = birthday - today;

        System.out.println("남은 날짜: " + gap / 1000 / 60 / 60 / 24);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1(일), 2(월), 3(화), ... , 7(토)
        switch (dayOfWeek) {
            case 1:
                System.out.println("일요일");
                break;
            case 2:
                System.out.println("월요일");
                break;
            case 3:
                System.out.println("화요일");
                break;
            case 4:
                System.out.println("수요일");
                break;
            case 5:
                System.out.println("목요일");
                break;
            case 6:
                System.out.println("금요일");
                break;
            case 7:
                System.out.println("토요일");
                break;
        }
    }
}
