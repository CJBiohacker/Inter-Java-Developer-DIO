package JavaCollectionsStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ArrayListCollectionsIterator {

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
        System.out.println(tamanho + " elemento(s)" + "\n");

        boolean presencaNegrini = ChamadaAula.contains("Alessandra Negrini");
        System.out.println("  -Conferindo presença de Alessandra Negrini");
        System.out.println(presencaNegrini + "\n");

        boolean listaVazia = ChamadaAula.isEmpty();
        System.out.println("  -Conferindo se a lista de presença está vazia");
        System.out.println(listaVazia + "\n");

        ChamadaAula.clear();
        listaVazia = ChamadaAula.isEmpty();
        System.out.println("  -Conferindo se a lista de presença está vazia");
        System.out.println(listaVazia + "\n");

        ChamadaAula.add("Bianca Levy");
        ChamadaAula.add("Alessandra Negrini");
        ChamadaAula.add("Katia Munhoz");
        ChamadaAula.add("Zé Ramalho");
        ChamadaAula.add("Nara Leão");

        System.out.println("  -Voltando para lista de chamada inicial");
        System.out.println(ChamadaAula + "\n");

        System.out.println("  -Verificando o índice/posição de Zé Ramalho");
        int posicao = ChamadaAula.indexOf("Zé Ramalho");
        System.out.println(posicao + "\n");

        System.out.println("Lista de Nomes (Método for)");
        for (String elementosLista: ChamadaAula) {
            System.out.println("-" + elementosLista);
        }

        System.out.println("\nLista de Nomes (Método iterator/while)");
        Iterator<String> iterador = ChamadaAula.iterator();
        while(iterador.hasNext()) {
            System.out.println("-" + iterador.next());
        }

    }

}
