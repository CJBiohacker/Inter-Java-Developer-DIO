package ProgramacaoOrientadaObjetos.ExercicioHerançaPolimorfismo;

class CargoLoja {

    private String nome;
    protected double salario, imposto;

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setImposto(double imposto) {
        this.imposto = imposto;
    }

    protected double getImposto() {
        return imposto;
    }

    protected double calcImposto() {
        return this.salario*imposto;
    }

}
