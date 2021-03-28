package DateCalendarTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExFinalSimpleDateFormat {

    public static void main(String[] args) {

        Date Now = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");

        System.out.println(Now);

        String dataFormatada = formatador.format(Now);

        System.out.println(dataFormatada);


    }

}
