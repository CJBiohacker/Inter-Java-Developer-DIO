package ExercicioCarro;

class Carro {

    protected int quantidade = 5;

    protected String getqtd() {
        return "Cabem no máximo " + quantidade + " pessoas";
    }

    protected String vaga() {
        return "Ainda tem vaga no carro.";
    }

    protected String lotado() {
        return "O carro está cheio de pessoas";
    }

}
