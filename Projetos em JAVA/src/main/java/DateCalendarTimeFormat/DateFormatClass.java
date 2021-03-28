package DateCalendarTimeFormat;

import java.util.Date;
import java.text.DateFormat;

class DateFormatClass {

    public static void main(String[] args) {

        Date now = new Date();

        String dateToStr = DateFormat.getInstance().format(now);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG).format(now);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT).format(now);

        System.out.println(dateToStr);

    }

}
