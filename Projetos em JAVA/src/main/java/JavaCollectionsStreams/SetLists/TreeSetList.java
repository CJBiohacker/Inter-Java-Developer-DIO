package JavaCollectionsStreams.SetLists;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetList {

    public static void main(String[] args) {

        TreeSet<String> bestiarioTreeW3 = new TreeSet<>();

        bestiarioTreeW3.add("Leshen");
        bestiarioTreeW3.add("Fetulho");
        bestiarioTreeW3.add("Silvano");
        bestiarioTreeW3.add("Nekker");
        bestiarioTreeW3.add("Afogador");
        bestiarioTreeW3.add("Endriúga");
        bestiarioTreeW3.add("Barghest");
        bestiarioTreeW3.add("2 Súcubos");

        System.out.println("Bestiário de Monstros e Criaturas:\n" + bestiarioTreeW3);
        // Prioridade de ordenação : Número(Crescente) > Alfabética(Crescente)

        System.out.println("\nTotal de Monstros e/ou Criaturas: " + bestiarioTreeW3.size());

        System.out.println("\nPrimeiro Monstro/Criatura: " + bestiarioTreeW3.first());
        System.out.println("Segundo Monstro/Criatura: " + bestiarioTreeW3.higher("2 Súcubos"));
        System.out.println("Penúltimo Monstro/Criatura: " + bestiarioTreeW3.lower("Silvano"));
        System.out.println("Último Monstro/Criatura: " + bestiarioTreeW3.last());

        System.out.println("\nRemovendo as Súcubos do Bestiário:");
        bestiarioTreeW3.remove("2 Súcubos");

        Iterator<String> iteradorTree = bestiarioTreeW3.iterator();
        while (iteradorTree.hasNext()) {
            System.out.println("- " + iteradorTree.next());
        }

        System.out.println("\nRemovendo o Fetulho do Bestiário:");
        bestiarioTreeW3.remove("Fetulho");
        for (String seqN: bestiarioTreeW3) {
            System.out.println("- " + seqN);
        }

        System.out.println("\nLimpando a sequência:");
        bestiarioTreeW3.clear();
        System.out.println(bestiarioTreeW3);
    }
}

