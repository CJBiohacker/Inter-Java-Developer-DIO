package ProgramacaoOrientadaObjetos.ExercicioHerançaPolimorfismo;

class Atendente extends CargoLoja {

    protected double calcImposto() {
        return this.salario*0.0001;

    }

}
