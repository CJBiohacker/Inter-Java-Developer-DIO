package JavaCollectionsStreams.Optionals;

import java.util.Optional;
import java.lang.IllegalStateException;

class OptionalsExercFinal {

    public static void main(String[] args) throws IllegalStateException {

        // Criado os Optionals com 3 estados distintos. Vazio, Presente e Nulo.
        Optional <String> OptEntryA = Optional.empty();
        Optional <String> OptEntryB = Optional.of("Presente");
        Optional <String> OptEntryC = Optional.ofNullable(null);



        /* Checando o Optional com entrada VAZIA no método ifPresenteOrElse. Se a entrada estiver no estado PRESENTE,
        retornará o "valor" do OptEntryA, caso contrário, estando no VAZIO retorna a mensagem "Optional Vazio"
        e lança uma IllegalStateException */
        System.out.println("Checando o valor da entrada Optional A");
        System.out.print("Status = ");
        OptEntryA.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
        //System.out.println(OptEntryA.orElseThrow());

        /* Checando o Optional com entrada PRESENTE no método ifPresenteOrElse. Se a entrada estiver no estado PRESENTE,
        retornará o "valor" do OptEntryB, caso contrário, estando no VAZIO retorna a mensagem "Optional Vazio" */
        System.out.println("\nChecando o valor da entrada Optional B");
        System.out.print("Status = ");
        OptEntryB.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        /* Checando o Optional com entrada NULA no método ifPresenteOrElse. Se a entrada estiver no estado PRESENTE,
        retornará o "valor" do OptEntryC, caso contrário, estando no VAZIO retorna a mensagem "Nulo e Não está Presente" */
        System.out.println("\nChecando o valor da entrada Optional C");
        System.out.print("Status = ");
        OptEntryC.ifPresentOrElse(System.out::println , () -> System.out.println("Nulo e Não está Presente"));

    }

}
