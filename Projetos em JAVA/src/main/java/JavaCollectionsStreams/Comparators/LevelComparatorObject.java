package JavaCollectionsStreams.Comparators;

import java.util.Comparator;

public class LevelComparatorObject implements Comparator<PersonagemRPG> {

    //Método da Implementação Comparator que compara 2 personagens e retorna a ordem crescente
    @Override
    public int compare(PersonagemRPG o1, PersonagemRPG o2) {
        return o1.getLevel() - o2.getLevel();
    }
}
