package DesafiosDIoJavaBasico;

import java.util.Scanner;

public class Desafio3Basico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de entrada: ");
        int num = entrada.nextInt();
        System.out.println("\nNúmeros Ímpares menor que o valor de Entrada");
        for (int i = 1; i <= num; i = i + 2) { //complete seu codigo aqui
            System.out.println("Valor: " + i);
        }
    }

}

