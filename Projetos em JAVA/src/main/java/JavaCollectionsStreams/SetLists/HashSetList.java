package JavaCollectionsStreams.SetLists;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

class HashSetList {

    public static void main(String[] args) {

        Set<Double> notaTurma = new HashSet<>();

        notaTurma.add(4.25);
        notaTurma.add(8.75);
        notaTurma.add(7.5);
        notaTurma.add(9.0);
        notaTurma.add(10.0);
        notaTurma.add(9.5);

        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("|      Escola de Engenharia de TI      |");
        System.out.println("|______________________________________|\n");
        System.out.println("Notas da Turma C5: " + notaTurma);

        System.out.println("\n   -Remove a nota 4.25 da tabela");
        notaTurma.remove(4.25);
        System.out.println("Notas da Turma C5 (atualizada): " + notaTurma);

        System.out.println("\nTotal de Notas da Turma C5: " + notaTurma.size());

        Iterator<Double> iterador = notaTurma.iterator();
        while (iterador.hasNext()) {
            System.out.println("- " + iterador.next());
        }

        System.out.println("\nNotas da Turma C5 (atualizada)");
        for (Double notas: notaTurma) {
            System.out.println("- " + notas);
        }

        System.out.println("\nLimpando as notas da Turma C5: ");
        notaTurma.clear();
        System.out.println(notaTurma);


    }
}
