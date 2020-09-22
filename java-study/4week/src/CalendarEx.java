import java.util.Date;

public class CalendarEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d: " + d);

        System.out.println("year: " + d.getYear());
        System.out.println("month: " + d.getMonth());
        System.out.println("hour: " + d.getHours());
        System.out.println("minute: " + d.getMinutes());
        System.out.println("second: " + d.getSeconds());
    }
}
