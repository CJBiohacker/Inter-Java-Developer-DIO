package JavaCollectionsStreams.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class ExercFinalStreams {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Carlos", 31));
        estudantes.add(new Estudante("Shina", 25));
        estudantes.add(new Estudante("José", 28));
        estudantes.add(new Estudante("Lucas", 24));
        estudantes.add(new Estudante("Jonathan", 25));
        estudantes.add(new Estudante("Allan", 30));
        estudantes.add(new Estudante("Michael", 26));
        estudantes.add(new Estudante("Leandro", 17));
        estudantes.add(new Estudante("Bruno", 32));

        System.out.println("Número total de Estudantes (método Count)");
        System.out.println("    Quantidade = " + estudantes.stream().count() + " alunos");

        System.out.println("\nNúmero total de Estudantes (método Size)");
        System.out.println("    Quantidade = " + estudantes.size() + " alunos");

//        System.out.println("\nNúmero total de Estudantes com idade maior de 18 anos");
//        System.out.println("    Quantidade = " + estudantes.stream()
//                .filter(estudante -> estudante.getIdadeMaior18()));

        System.out.println("\nLista de Estudantes (atualizada)");
        estudantes.forEach(estudante -> System.out.println(" " + estudante.getNome() +
                " - " + estudante.getIdade() + " anos"));

        System.out.println("\nEstudantes com a letra 'B' no nome: " + estudantes.stream()
                .filter((estudante) -> estudante.toString().toLowerCase().contains("B"))
                .collect(Collectors.toList()));

    }

}
