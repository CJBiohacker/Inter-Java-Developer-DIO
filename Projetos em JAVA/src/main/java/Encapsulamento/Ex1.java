package Encapsulamento;

class Ex1 {

    public static void main(String[] args) {

        Pessoa cj = new Pessoa("Carlos", 12, 3, 1990);

        System.out.println("Nome: "+ cj.getNome());
        System.out.println("Data de Nascimento: " + cj.getDataNasc());
        //System.out.println("Idade: " + cj.calcIdade() + " ano(s)" );

        cj.setNome("Carlos Junior");

        System.out.println("Nome Completo: " + cj.getNome());

    }

}
