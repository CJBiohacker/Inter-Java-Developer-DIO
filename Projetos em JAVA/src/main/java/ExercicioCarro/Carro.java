package ExercicioCarro;

public class Carro {

    public int quantidade = 5;

    public String getqtd() {
        return "Cabem no máximo " + quantidade + " pessoas";
    }

    public String vaga() {
        return "Ainda tem vaga no carro.";
    }

    public String lotado() {
        return "O carro está cheio de pessoas";
    }

}
