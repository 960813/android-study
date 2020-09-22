import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
//        Calendar cal = new Calendar();
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);

        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("오늘 날짜: " + year + "-" + month + "-" + day);
        System.out.println("현재 시간: " + hour + ":" + minute + ":" + second);
    }
}
