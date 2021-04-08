package JavaCollectionsStreams;

import java.util.LinkedHashSet;
import java.util.Iterator;

class LinkedHashSetList {

    public static void main(String[] args) {

        LinkedHashSet<Integer> seqNum = new LinkedHashSet<>();

        seqNum.add(7);
        seqNum.add(8);
        seqNum.add(4);
        seqNum.add(9);
        seqNum.add(10);
        seqNum.add(2);

        System.out.println("Sequência de números: " + seqNum);

        System.out.println("\nTotal de nº's da sequência: " + seqNum.size());

        Iterator<Integer> iteradorSeq = seqNum.iterator();
        while (iteradorSeq.hasNext()) {
            System.out.println("- " + iteradorSeq.next());
        }

        System.out.println("\nNº's da sequência");
        for (Integer seqN: seqNum) {
            System.out.println("- " + seqN);
        }

        System.out.println("\nLimpando a sequência:");
        seqNum.clear();
        System.out.println(seqNum);
    }
}
