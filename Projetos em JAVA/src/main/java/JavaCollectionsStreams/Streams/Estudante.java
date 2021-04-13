package JavaCollectionsStreams.Streams;

class Estudante {

    private final String nome;
    private final int idade;

    protected Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected boolean getIdadeMaior18() {
        return idade >= 18;
    }

}
