package JavaCollectionsStreams.Queues;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class QueueList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Nara Leão");
        filaBanco.add("Raul Seixas");
        filaBanco.add("Roberto Carlos");
        filaBanco.add("Chico Buarque");
        filaBanco.add("Gilberto Gil");
        filaBanco.add("Raul Seixas");
        filaBanco.add("Caetano Veloso");
        filaBanco.add("Elis Regina");
        filaBanco.add("Milton Nascimento");

        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("|     Bem-vindo ao Banco Bossa Nova    |");
        System.out.println("|______________________________________|");
        System.out.println("\nFila de Clientes");
        for (String fila: filaBanco ) {
            System.out.println("-" + fila);
        }

        String proxCliente = filaBanco.poll();
        /*  Cada vez que o poll for associado à String, o 1º item atual da fila será retornado e removido */
        System.out.print("\n   -Próximo cliente a ser atendido: " + proxCliente + "\n");
        System.out.println("\nFila de Clientes atualizada");
        for (String fila: filaBanco ) {
            System.out.println("-" + fila);
        }

        proxCliente = filaBanco.peek();
        System.out.print("\n   -Próximo cliente a ser atendido: " + proxCliente + "\n");
        System.out.println("\nFila de Clientes atualizada");
        for (String fila: filaBanco ) {
            System.out.println("-" + fila);
        }

        System.out.println("\n   -Parece que tivemos um erro no ordenamento das filas.");
        System.out.println("Estamos trabalhando para corrigir este problema e pedimos desculpas.");

        proxCliente = filaBanco.poll();
        System.out.println("\nFila de Clientes atualizada(corrigida)");
        Iterator<String> listaBanco = filaBanco.iterator();
        while (listaBanco.hasNext()) {
            System.out.println("-" + listaBanco.next());
        }

        System.out.println("   Total de clientes na espera: " + filaBanco.size());

        filaBanco.clear();
        String cliente = filaBanco.peek();
        System.out.println("\n   -Houve um problema no provedor local de internet e estamos com o sistema fora do ar.");
        System.out.println("A ordem da fila foi zerada e pedimos a compreensão de todos até que tudo se normalize.\n");
        System.out.println("Fila de Clientes\n" + cliente);

//      String errocliente = filaBanco.element();
//      Como a fila está vazia, validar o método element causará erro de compilação.

        System.out.println("\nFila de Clientes\n" + filaBanco);

    }
}
