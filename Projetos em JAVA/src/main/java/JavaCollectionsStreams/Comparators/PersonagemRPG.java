package JavaCollectionsStreams.Comparators;

class PersonagemRPG implements Comparable<PersonagemRPG> {

    // Variáveis
    private final String nome;
    private final int level;

    //Construtor
    protected PersonagemRPG ( String nome, Integer level) {
        this.nome = nome;
        this.level = level;
    }

    // Métodos da Classe
    protected String getNome() {
        return nome;
    }

    protected Integer getLevel() {
        return level;
    }

    //Método da Classe Object do pacote java.lang
    @Override
    public String toString() {
        return nome + " = " + level;
    }

    //Método da Implementação Comparable
    @Override
    public int compareTo(PersonagemRPG o) {
        return this.getLevel() - o.getLevel();
    }

}
