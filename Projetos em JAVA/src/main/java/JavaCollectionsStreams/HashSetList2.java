package JavaCollectionsStreams;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetList2 {
    public static void main(String[] args) {

        Set<Integer> notaTurma = new HashSet<>();

        notaTurma.add(4);
        notaTurma.add(2);
        notaTurma.add(23);
        notaTurma.add(14);
        notaTurma.add(55);

        System.out.println("\nTotal de Notas da Turma C5: " + notaTurma.size());

        Iterator<Integer> iterador = notaTurma.iterator();
        while (iterador.hasNext()) {
            System.out.println("- " + iterador.next());
        }

        //Collections.sort(notaTurma);
        notaTurma.add(23);
        notaTurma.add(null);

        System.out.println("\nNotas da Turma C5 (atualizada)");
        for (Integer notas: notaTurma) {
            System.out.println("- " + notas);
        }

        System.out.println("\nLimpando as notas da Turma C5: ");
        notaTurma.clear();
        System.out.println(notaTurma);


    }
}
