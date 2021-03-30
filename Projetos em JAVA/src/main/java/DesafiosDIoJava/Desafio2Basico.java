package DesafiosDIoJava;

import java.io.IOException;
import java.util.Scanner;

class Desafio2Basico {

    public static void main(String[] args) throws IOException {
        System.out.print("Digite o índice do Vetor: ");
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int[] X = new int[N];
        int menor = 0, posMenor = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor do elemento: ");
            X[i] = leitor.nextInt();
            System.out.print("\n");
            if (i == 0) {
                menor = X[i];
                posMenor = i;
            } else if (X[i] < menor) {
                menor = X[i];
                posMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor ); //complete o codigo aqui de acordo com a variavel esperada
        System.out.println("Posicao: " + posMenor); //complete o codigo aqui de acordo com a variavel esperada
    }

}