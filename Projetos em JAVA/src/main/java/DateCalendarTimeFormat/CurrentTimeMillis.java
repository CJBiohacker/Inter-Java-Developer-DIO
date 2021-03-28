package DateCalendarTimeFormat;

import java.util.Date;

class CurrentTimeMillis {

    public static void main(String[] args) {

        Long TimeMillis = System.currentTimeMillis();

        System.out.println(TimeMillis);

        Date DataAtual = new Date(TimeMillis);

        System.out.println(DataAtual);

    }

}
