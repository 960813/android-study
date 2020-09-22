import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);

        System.out.println("현재 날짜: " + year + "/" + month + "/" + day);

        // 2019년 12월 25일은 무슨 요일?
        // DAY_OF_WEEK: 1(일), 2(월), 3(화), ... , 7(토)
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DATE, 25);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("요일: " + dayOfWeek);
    }
}
