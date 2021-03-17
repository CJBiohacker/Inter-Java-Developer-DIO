package ExercicioCarro;

import java.util.Scanner;

public class EntradaSaida {

    public static void main (String[] args) {

        Carro carro = new Carro();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Quantas pessoas cabem no carro?");
        System.out.println(carro.getqtd());

        System.out.println("Quantas pessoas entraram no carro ? ");
        int qtdatual = myObj.nextInt();
        System.out.println(qtdatual + " pessoas.");

            if (qtdatual < carro.quantidade) {
                System.out.println(carro.vaga());
            } else {
                System.out.println(carro.lotado());
            }

        System.out.println("Quantas pessoas saíram do carro ? ");
        int qtdatual2 = myObj.nextInt();
        System.out.println(qtdatual2 + " pessoas.");

            if (qtdatual >= qtdatual2 ) {
                System.out.println(carro.vaga());
            } else {
                System.out.println(carro.lotado());
            }

    }

}

