package JavaCollectionsStreams;

import java.util.List;
import java.util.Vector;

class VectorList {

    public static void main(String[] args) {

        List<String> listaJogo = new Vector<>();

        listaJogo.add("Silent Hill");
        listaJogo.add("Metal Gear Solid V");
        listaJogo.add("Valheim");
        listaJogo.add("Katana Zero");

        System.out.println("Lista de jogos");
        System.out.println(listaJogo + "\n");

        System.out.println("   -Substitui MGSV por HoTS");
        listaJogo.set(1, "Heroes of the Storm");
        System.out.println(listaJogo + "\n");

        System.out.println("   -Mostra o 1º jogo da lista");
        System.out.println(listaJogo.get(0) + "\n");

        System.out.println("   -Remove o 2º jogo da lista(HoTS)");
        listaJogo.remove(1);
        System.out.println(listaJogo + "\n");

        System.out.println("   -Remove o Valheim da lista");
        listaJogo.remove("Valheim");
        System.out.println(listaJogo + "\n");

        System.out.println("Lista de jogos atualizada em formato de fila");
        for (String lista: listaJogo ) {
            System.out.println("-" + lista);
        }

        System.out.println("\n   -Re-adicionando os jogos da última lista atualizada");
        listaJogo.addAll(listaJogo);
        System.out.println(listaJogo);

        System.out.println("\n   -Verificando o índice de um elemento inexistente");
        System.out.println(listaJogo.indexOf("SilentHill"));

    }
}
