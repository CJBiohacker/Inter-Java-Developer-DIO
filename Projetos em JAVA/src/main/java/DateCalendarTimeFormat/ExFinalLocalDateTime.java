package DateCalendarTimeFormat;

import java.time.LocalDateTime;

public class ExFinalLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime Data = LocalDateTime.of(2010,5,15,10,0,0);

        System.out.println(Data);

        LocalDateTime DataMod = Data.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(DataMod);

    }

}