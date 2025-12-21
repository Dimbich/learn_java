package chapter10;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());
        calendar.add(calendar.DATE, 30);
        System.out.println(calendar.getTime());
        calendar.roll(calendar.MONTH, false);
        System.out.println(calendar.getTime());
    }
}
