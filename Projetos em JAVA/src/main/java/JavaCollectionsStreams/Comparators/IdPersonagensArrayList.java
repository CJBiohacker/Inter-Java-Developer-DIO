package JavaCollectionsStreams.Comparators;

import java.util.*;

class IdPersonagensArrayList {

    public static void main(String[] args) {

        ArrayList<PersonagemRPG> IdPersonagem = new ArrayList<>();

        IdPersonagem.add(new PersonagemRPG("Illidan",100));
        IdPersonagem.add(new PersonagemRPG("Lich King",100));
        IdPersonagem.add(new PersonagemRPG("PathRunner",40));
        IdPersonagem.add(new PersonagemRPG("Ogmot the Mad",45));
        IdPersonagem.add(new PersonagemRPG("Yggdrel",40));
        IdPersonagem.add(new PersonagemRPG("Volchan",30));

        System.out.println("Lista de Personagens e Level de World of Warcraft");
        System.out.println(IdPersonagem);

        //Utilizando o método compare do Objeto LevelComparatorObject para classificar em ordem crescente do level.
        Collections.sort(IdPersonagem,new LevelComparatorObject());
        System.out.println("\n    -Organizando o level dos  NPC's em ordem Crescente.");
        System.out.println(IdPersonagem);

        //Utilizando a função comparing da Interface Comparator para classificar em ordem alfabética.
        IdPersonagem.sort(Comparator.comparing(PersonagemRPG::getNome));
        System.out.println("\n    -Organizando o nome dos NPC's em ordem Alfabética.");
        System.out.println(IdPersonagem);

        //Utilizando a função omparing da Interface Comparator para classificar em ordem decrescente o level.
        IdPersonagem.sort(Comparator.comparingInt(PersonagemRPG::getLevel).reversed());
        System.out.println("\n    -Organizando level dos NPC's em ordem Decrescente.");
        System.out.println(IdPersonagem);


    }

}
