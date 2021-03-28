package DateCalendarTimeFormat;

import java.util.Date;

class ExFinalAulaDate {

    public static void main(String[] args) {

        Long MillisNasc = 637255800000L , DataSet = 1273892400000L;


        Date DataNasc = new Date(MillisNasc);
        Date DataSetada = new Date(DataSet);

        System.out.println("Data de Nascimento em Tempo Unix: " + MillisNasc + "ms");
        System.out.println("Data de Nascimento: " + DataNasc);

        boolean AntesDe = DataNasc.before(DataSetada);
        boolean DepoisDe = DataNasc.after(DataSetada);

        System.out.println("Data de Nascimento é anterior à Data Setada" + " - " + AntesDe);
        System.out.println("Data de Nascimento é posterior à Data Setada" + " - " + DepoisDe);

    }

}
