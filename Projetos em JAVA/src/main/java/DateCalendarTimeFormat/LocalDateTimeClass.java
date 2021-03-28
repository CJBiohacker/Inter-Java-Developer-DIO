package DateCalendarTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

class LocalDateTimeClass {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        LocalDateTime amanhã = agora.plusHours(2).minusMinutes(27).plusSeconds(3);

        System.out.println(amanhã);


    }

}
