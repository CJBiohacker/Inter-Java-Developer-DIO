package DesafiosDIoJavaBasico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Desafio1Basico {
    public static void main(String[] args) throws IOException {
        System.out.print("Digite a variável a: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print("Digite a variável b: ");

        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st.nextToken());
        int total = a*b; // Altere o valor da variável com o cálculo esperado
        System.out.println("PROD = " + total);
    }
}