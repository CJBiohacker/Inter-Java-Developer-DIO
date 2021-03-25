package FunçoesEOperadores;

class Pessoa {

    private String nome = "CJ";
        /* Cria-se um ATRIBUTO da CLASSE 'Pessoa'. Neste caso, 'nome' que é uma
        característica de pessoas. E vincula a String "CJ" ao ATRIBUTO. */

    public String getNome() {
        return nome;
        /* Cria-se um MÉTODO que busca o nome da pessoa através do código 'getNome',
        que vai puxar o nome definido no ATRIBUTO 'nome', neste caso 'CJ'. */
    }

    public String falarNome() {
        return "Meu nome é: " + getNome();
        /* Cria-se um MÉTODO que simula uma pessoa falando o próprio nome através do
        código 'falarNome'. Neste caso, já existe um nome vinculado ao getNome ('CJ'); */
    }

}
