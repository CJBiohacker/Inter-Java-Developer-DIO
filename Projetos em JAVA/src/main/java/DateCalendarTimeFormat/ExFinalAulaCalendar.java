package DateCalendarTimeFormat;

import java.util.Calendar;

class ExFinalAulaCalendar {

    public static void main(String[] args) {

        Calendar DataVenc = Calendar.getInstance();
        Calendar DataMaxPag = Calendar.getInstance();

        System.out.println("    Fatura de Crédito    \n");
        System.out.println("Valor da Fatura: R$ 354,69");

        DataVenc.set(2021, Calendar.MARCH, 29, 22, 0);
        System.out.print("Data Vencimento: ");
        System.out.printf( "%tD\n", DataVenc.getTime());

        System.out.print("Data Máxima Pag. s/ Juros: ");
        DataMaxPag.set(2021, Calendar.APRIL, 12, 22, 0);
        System.out.printf("%tD\n", DataMaxPag.getTime());

        System.out.println("Prazo de Pagamento: 14 dias");


    }

}
