package ProgramacaoOrientadaObjetos.ExercicioHerançaPolimorfismo;

class Gerente extends CargoLoja {

    protected double calcImposto() {
       return this.salario*0.001;

    }

}

