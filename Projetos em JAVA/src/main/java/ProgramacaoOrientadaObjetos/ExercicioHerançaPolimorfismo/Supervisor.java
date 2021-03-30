package ProgramacaoOrientadaObjetos.ExercicioHerançaPolimorfismo;

class Supervisor extends CargoLoja {

    protected double calcImposto() {
        return this.salario*0.0005;

    }

}