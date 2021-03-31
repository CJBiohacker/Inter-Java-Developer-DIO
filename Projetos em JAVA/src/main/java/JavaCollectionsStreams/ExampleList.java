package JavaCollectionsStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ExampleList {

    public static void main(String[] args) {

        List<String> ChamadaAula = new ArrayList<>();

        ChamadaAula.add("Bianca Levy");
        ChamadaAula.add("Alessandra Negrini");
        ChamadaAula.add("Katia Munhoz");
        ChamadaAula.add("Zé Ramalho");
        ChamadaAula.add("Nara Leão");

        System.out.println("Lista de Chamada");
        System.out.println("  -Ordem Padrão");
        System.out.println(ChamadaAula + "\n");

        ChamadaAula.set(2, "Jorge Ben Jor");
        System.out.println("  -Jorge substitui Katia");
        System.out.println(ChamadaAula + "\n");

        Collections.sort(ChamadaAula);

        System.out.println("Lista de Chamada Ordem Alfabética");
        System.out.println("  -Ivete substitui Zé Ramalho");
        ChamadaAula.set(3, "Ivete Sangalo");
        System.out.println(ChamadaAula + "\n");

        ChamadaAula.remove(1 );

        System.out.println("  -Bianca removida");
        System.out.println(ChamadaAula + "\n");

        ChamadaAula.remove("Zé Ramalho");
        System.out.println("  -Zé Ramalho removido");
        System.out.println(ChamadaAula + "\n");

        String nome = ChamadaAula.get(1);
        System.out.println("  -Chamando...");
        System.out.println(nome + "\n");

        int tamanho = ChamadaAula.size();
        System.out.println("  -Tamanho da Lista Atual");
        System.out.println(tamanho + " elemento(s)");

    }

}
