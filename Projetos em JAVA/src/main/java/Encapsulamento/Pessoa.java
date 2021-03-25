package Encapsulamento;

import java.time.LocalDate;
import java.time.Period;

class Pessoa {

    private String nome;
    private final LocalDate data;


    protected Pessoa(String nome, int dia, int mes, int ano){
        this.nome = nome;
        this.data = LocalDate.of(dia, mes, ano);
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected LocalDate getDataNasc() {
        return data;
    }

    /*protected int calcIdade() {
        return Period.between(data, LocalDate.now().getYear());

    }*/
}
