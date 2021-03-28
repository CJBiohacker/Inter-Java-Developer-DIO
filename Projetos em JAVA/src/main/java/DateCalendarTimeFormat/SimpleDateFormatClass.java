package DateCalendarTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {

    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatador.format(now);

        System.out.println(dataFormatada);

    }
}
